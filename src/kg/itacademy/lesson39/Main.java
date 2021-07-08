package kg.itacademy.lesson39;

import kg.itacademy.lesson39.model.Students;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentsDao studentsDao = new StudentsDao();
        List<Students> students = studentsDao.getAll();
        for(Students student : students) {
            System.out.println(student);
        }
    }
}
