package kg.itacademy.practice;

import java.awt.*;

public class ChessTest {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                LocationOfFigure location = new LocationOfFigure(i, j);
                chessBoard.fillField(new Rectangle(10, location, Color.BLACK));
            }
        }

        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                Rectangle field = chessBoard.getField(i, j);
                System.out.println(field.speak());
            }
        }

        System.out.println("Прямоугольники : " + Rectangle.getCountOfRectangles());
        System.out.println("Квадараты : " + Rectangle.getCountOfSquares());
    }
}
