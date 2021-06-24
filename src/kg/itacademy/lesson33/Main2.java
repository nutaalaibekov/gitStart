package kg.itacademy.lesson33;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat murka = new Cat(5, "Murka");
        Cat tom = new Cat(5, "Tom");
        cats.add(murka);
        cats.add(tom);

        System.out.println(cats.contains(new Cat(5, "Murka")));
        System.out.println(cats.contains(tom));
    }
}
