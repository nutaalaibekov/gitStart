package kg.itacademy.lesson16;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Cat matros = new Cat("Matros", 1);
        Cat murka = new Cat("Murka", 1);

        System.out.println(matros);
        System.out.println(murka);

        matros.setAge(2);
        murka.setAge(3);

        System.out.println(matros);
        System.out.println(murka);
    }
}
