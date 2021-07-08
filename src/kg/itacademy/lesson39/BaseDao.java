package kg.itacademy.lesson39;

import java.sql.*;

public class BaseDao {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "admin";

    public Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
