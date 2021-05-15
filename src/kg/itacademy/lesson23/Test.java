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
        circles[1] = new Circle(120, 120, Color.YELLOW, 70, 70);
        circles[2] = new Circle(140, 140, Color.GREEN, 80, 80);
        circles[3] = new Circle(160, 160, Color.GRAY, 90, 90);
        circles[4] = new Circle(180, 180, Color.RED, 100, 100);
        circles[5] = new Circle(200, 200, Color.MAGENTA, 110, 110);
        circles[6] = new Circle(220, 220, Color.BLUE, 120, 120);

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
