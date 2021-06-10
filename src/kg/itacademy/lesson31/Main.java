package kg.itacademy.lesson31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 1; i <= 10000; i++) {
            if(i * i <= 10000) {
                squares.add(i * i);
            } else {
                break;
            }
        }
        for (int i = 0; i < squares.size(); i++) {
            System.out.println(squares.get(i));
        }
    }
}
