package kg.itacademy.lesson28;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z\n");
        fileWriter.write("0123456789\n");
        fileWriter.close();

    }
}
