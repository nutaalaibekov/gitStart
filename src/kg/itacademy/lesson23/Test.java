package kg.itacademy.lesson23;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas {
    public Test() {
    }

    @Override
    public void paint(Graphics graphics) {
       Circle circles = new Circle(0, 0, Color.YELLOW, 50, 50);
        graphics.setColor(circles.getColor()); // Нас интересует только этот блок
        graphics.fillOval(circles.getX(), circles.getY(), circles.getWidth(), circles.getHeight()); // Остальное магия…

        Circle circles2 = new Circle(100, 100, Color.GREEN, 50, 50);
        graphics.setColor(circles2.getColor()); // Нас интересует только этот блок
        graphics.fillOval(circles2.getX(), circles2.getY(), circles2.getWidth(), circles2.getHeight()); // Остальное магия…

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
