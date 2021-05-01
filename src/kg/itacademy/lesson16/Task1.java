package kg.itacademy.lesson16;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Circle black = new Circle(100);
        Circle yellow = new Circle(100, "Yellow");
        Circle hamleon = new Circle(100, "Green", true);

        System.out.println(black);
        System.out.println(yellow);
        System.out.println(hamleon);
    }
}
