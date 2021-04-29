package lessons16Alexander;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        rect.setSideA(sc.nextInt());
        rect.setSideB(sc.nextInt());
        System.out.println(rect.getSideA() * rect.getSideB());


    }
}
