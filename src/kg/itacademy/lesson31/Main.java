package kg.itacademy.lesson31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>(100);
        ArrayList<Integer> indexes = new ArrayList<>(100);
        for(int i = 1; i <= 10000; i++) {
            if(i * i <= 10000) {
                squares.add(i * i);
                if (squares.get(squares.size() - 1) % 2 == 0 || squares.get(squares.size() - 1) % 3 == 0)
                     indexes.add(squares.size() - 1);
            } else {
                break;
            }
        }

        System.out.println(squares);
        System.out.println(indexes);
    }
}
