package kg.itacademy.lesson44;

import kg.itacademy.lesson43.model.LotteryModel;

import java.sql.*;

public class UsersDao {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "postgres";

    private Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public UserModel createUser(UserModel userModel) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            userModel.setDateOfRegistration(new java.util.Date());
            connection = connect();
            statement = connection
                    .prepareStatement("insert into users( login, email, password, date_of_registration)\n" +
                            " values(?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, userModel.getLogin());
            statement.setString(2, userModel.getEmail());
            statement.setString(3, userModel.getPassword());
            statement.setDate(4, new Date(userModel.getDateOfRegistration().getTime()));

            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                userModel.setId(resultSet.getInt(1));
            }
            return userModel;
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

    public UserModel getByUsername(String username) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connect();
            statement = connection
                    .prepareStatement("select id, login, email, password, date_of_registration \n" +
                            "from users where login = ?");
            statement.setString(1, username);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                UserModel user = new UserModel();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("login"));
                user.setLogin(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setDateOfRegistration(resultSet.getDate("date_of_registration"));
                return user;
            }
            return null;
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

    public void writeLog(UserLog userLog) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            statement = connection
                    .prepareStatement("insert into user_logs(is_success, user_id)\n" +
                            "values(?, ?)");
            statement.setBoolean(1, userLog.getSuccess());
            statement.setInt(2, userLog.getUserId());
            statement.executeUpdate();
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
    }
}
