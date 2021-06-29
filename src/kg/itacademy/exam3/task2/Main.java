package kg.itacademy.exam3.task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();


        try {
            addToList(list, new Person("Marat", "Maratov", "Maratovich"));
        } catch (IllegalArgumentException e) {
            System.out.println("Ne puluchilos, prichina: " + e);
        }

        try {
            addToList(list, new Person("Vasya", "Vasiliev", "Vasyilievich"));
        } catch (IllegalArgumentException e) {
            System.out.println("Ne puluchilos, prichina: " + e);
        }

        try {
            addToList(list, new Person("Vasya", "Vasiliev", "Vasyilievich"));
        } catch (IllegalArgumentException e) {
            System.out.println("Ne puluchilos, prichina: " + e);
        }

        System.out.println(list);

    }

    public static void addToList(LinkedList<Person> list, Person newElement) {
        if (list.contains(newElement)) {
            throw new IllegalArgumentException("Cannot add duplicate Person: " + newElement);
        }
        list.add(newElement);
    }
}

