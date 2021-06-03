package kg.itacademy.lesson28;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("file1.txt");
        Scanner sc = new Scanner(fileReader);
        int i = 1;
        while(sc.hasNextLine()) {
            System.out.println(i + " - " + sc.nextLine());
            i++;
        }
    }

}
