package kg.itacademy.lesson43.dao.impl;

import kg.itacademy.lesson43.dao.Lottery;
import kg.itacademy.lesson43.model.LotteryModel;
import kg.itacademy.lesson43.model.PrizeModel;
import kg.itacademy.lesson43.model.TicketModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LotteryImpl implements Lottery {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "postgres";

    private Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    @Override
    public LotteryModel createLottery(LotteryModel lotteryModel) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connect();
            statement = connection
                    .prepareStatement("insert into  lottery( name, description, date_start, date_end)\n" +
                                                                "values(?, ?, ?, ?)");
            statement.setString(1, lotteryModel.getName());
            statement.setString(2, lotteryModel.getDescription());
            statement.setDate(3, (Date) lotteryModel.getStartDate());
            statement.setDate(4, (Date) lotteryModel.getEndDate());

            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                lotteryModel.setId(resultSet.getInt(1));
            }
            return lotteryModel;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public PrizeModel createPrize(LotteryModel lotteryModel, PrizeModel prizeModel) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connect();
            statement = connection
                    .prepareStatement("insert into  prizes( name, price, is_win, lottery_id)\n" +
                            "values(?, ?, ?, ?)");
            statement.setString(1, prizeModel.getName());
            statement.setFloat(2, prizeModel.getPrice());
            statement.setBoolean(3, prizeModel.getWin());
            statement.setInt(4, lotteryModel.getId());

            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                prizeModel.setId(resultSet.getInt(1));
            }
            return prizeModel;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean createTickets(List<TicketModel> tickets) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            for(TicketModel ticketModel : tickets) {
                statement = connection
                        .prepareStatement("insert into tickets( ticket_number, is_sold, lottery_id)\n" +
                                "values(?, ?, ?)");
                statement.setInt(1, ticketModel.getTicketNumber());
                statement.setBoolean(2, ticketModel.getSold());
                statement.setInt(3, ticketModel.getLotteryId());
                try {
                    statement.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {

            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    @Override
    public boolean sellTicket(Integer ticketId) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            statement = connection
                    .prepareStatement("update tickets \n" +
                            "set is_sold = ?\n" +
                            "where id = ?");
            statement.setInt(1, ticketId);
            statement.setBoolean(2, true);
            int count = statement.executeUpdate();
            return count > 0;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {

            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean chooseWinner(TicketModel ticketModel, PrizeModel prizeModel) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            statement = connection
                    .prepareStatement("insert into winners( ticket_id, prize_id, win_date)\n" +
                            "values(?, ?, ?)");
            statement.setInt(1, ticketModel.getId());
            statement.setInt(1, prizeModel.getId());
            statement.setDate(2, (Date) new java.util.Date());
            int count = statement.executeUpdate();
            return count > 0;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {

            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<TicketModel> getAllTicetsByLottery(LotteryModel lotteryModel) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connect();
            statement = connection
                    .prepareStatement("select id, ticket_number, is_sold, lottery_id from tickets\n" +
                            "where lottery_id = ?");
            statement.setInt(1, lotteryModel.getId());
            resultSet = statement.executeQuery();
            List<TicketModel> tickets = new ArrayList<>();
            while (resultSet.next()) {
                TicketModel ticketModel = new TicketModel();
                ticketModel.setLotteryId(resultSet.getInt("lottery_id"));
                ticketModel.setId(resultSet.getInt("id"));
                ticketModel.setTicketNumber(resultSet.getInt("ticket_number"));
                ticketModel.setSold(resultSet.getBoolean("is_sold"));
                tickets.add(ticketModel);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {

            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
