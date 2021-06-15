package kg.itacademy.lesson32;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Kitty", 1);
        Cat cat2 = new Cat("Kitty2", 2);
        Cat cat3 = new Cat("Kitty3", 3);
        Cat tom = new Cat("Tom", new Integer(5));
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(tom);

//        System.out.println(cats.indexOf(new Cat("Tom", 5)));
        System.out.println(cats.contains(new Cat("Tom", new Integer(5))));

        Cat[] catsArray = cats.toArray(new Cat[cats.size()]);
        System.out.println(catsArray[0].getAge());

    }
}
