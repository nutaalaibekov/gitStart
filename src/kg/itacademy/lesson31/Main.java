package kg.itacademy.lesson31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>(100);

        int countNotOdd = 0;
        for(int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                squares.add(countNotOdd, i);
                countNotOdd++;
            } else {
                squares.add(i);
            }
        }

        System.out.println(squares.toString());

    }
}
