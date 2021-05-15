package kg.itacademy.lesson23;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas {
    public Test() {
    }

    @Override
    public void paint(Graphics graphics) {
        final Circle[] circles = new Circle[7];
        circles[0] = new Circle(100, 100, Color.BLACK, 60, 60);
        circles[1] = new Circle(150, 100, Color.BLACK, 60, 60);

        for(Circle circle : circles) {
            graphics.setColor(circle.getColor()); // Нас интересует только этот блок
            graphics.fillOval(circle.getX(), circle.getY(), circle.getWidth(), circle.getHeight()); // Остальное магия…
        }


    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
