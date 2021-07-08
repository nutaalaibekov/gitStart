package kg.itacademy.lesson39;

import kg.itacademy.lesson39.model.Students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentsDao extends BaseDao {
    public List<Students> getAll() {
        List<Students> students = null;
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try{
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM students");
            students = new ArrayList<>();

            while (resultSet.next()) {
                Students student = new Students();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setPatronymic(resultSet.getString("patronymic"));
                student.setHas_scholarship(resultSet.getBoolean("has_scholarship"));
                student.setFk_group_id(resultSet.getInt("fk_group_id"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return students;
    }
}
