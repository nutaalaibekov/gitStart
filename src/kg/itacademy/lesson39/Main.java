package kg.itacademy.lesson39;

import kg.itacademy.lesson39.dao.StudentsDao;
import kg.itacademy.lesson39.dao.impl.StudentsDaoImpl;
import kg.itacademy.lesson39.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentsDao studentsDao = new StudentsDaoImpl();
        List<Student> students = studentsDao.getAll();
        for(Student student : students) {
            System.out.println(student);
        }

//        Student studentForUpdate = students.get(0);
//        studentForUpdate.setFullName("TestOV");
//        studentsDao.updateStudent(studentForUpdate);
//
//        students = studentsDao.getAll();
//        for(Student student : students) {
//            System.out.println(student);
//        }
    }
}
