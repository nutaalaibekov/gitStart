package kg.itacademy.lesson19;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("KArabas", 20, 100);
        students[1] = new Student("Barabas", 20, 60);
        students[2] = new Student("Alas", 20, 50);
        students[3] = new Student("Kalas", 20, 30);
        students[4] = new Student("Max", 20, 20);

        int markSum = 0;
        for(Student student : students) {
            markSum = markSum + student.getMark();
        }
        System.out.println(markSum / students.length);

        markSum = 0;
        for(int i = 0; i < students.length; i++) {
            markSum += students[i].getMark();
        }
        System.out.println(markSum / students.length);
    }
}
