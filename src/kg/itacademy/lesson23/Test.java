package kg.itacademy.lesson23;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas {
    public Test() {
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.YELLOW); // Нас интересует только этот блок
        graphics.fillOval(100, 100, 100, 100); // Остальное магия…

        graphics.setColor(Color.GRAY); // Нас интересует только этот блок
        graphics.fillOval(200, 100, 100, 100); // Остальное магия…

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
