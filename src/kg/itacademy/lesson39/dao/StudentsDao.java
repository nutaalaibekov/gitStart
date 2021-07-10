package kg.itacademy.lesson39.dao;

import kg.itacademy.lesson39.model.Student;

import java.util.List;

public interface StudentsDao {
    List<Student> getAll();
    boolean updateStudent(Student student);
    int countStudents();
}
