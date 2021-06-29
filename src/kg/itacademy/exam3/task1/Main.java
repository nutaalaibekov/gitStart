package kg.itacademy.exam3.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[100];
        for(int i = 1; i <= 100; i++) {
            array[i-1] = i;
        }

        LinkedList<Integer> listOfIntegers = new LinkedList<>();
        for(Integer number : array) {
            if (number % 2 == 0) {
                if (number % 5 == 0) {
                    listOfIntegers.addFirst(number);
                } else {
                    listOfIntegers.addLast(number);
                }
            }
        }

        HashSet<Integer> setOfIntegers = new LinkedHashSet<>(listOfIntegers);
        System.out.println(setOfIntegers);
    }
}




