package lessons16Alexander;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        rect.setSideA(sc.nextInt());
        rect.setSideB(sc.nextInt());
        System.out.println(rect.getArea());

        if(rect.getSideA() == rect.getSideB()){
            System.out.println("Площадь квадрата " + rect.getArea() + " Его цвет: " + rect.getColor());
        }
        else {
            System.out.println("Площадь прямоугольника " + rect.getArea() + " Его цвет: " + rect.getColor());
        }




    }
}
