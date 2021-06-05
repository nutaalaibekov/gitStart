package kg.itacademy.lesson29;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        npe();
        iobeex();
        fnfe();
    }

    public static void npe() {
        try {
            String str = null;
            str.length();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void fnfe() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Test123123.txt");
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println(exception.getMessage());
        }
    }

    public static void iobeex() {
        try {
            int [] arr = new int[2];
            System.out.println(arr[3]);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
