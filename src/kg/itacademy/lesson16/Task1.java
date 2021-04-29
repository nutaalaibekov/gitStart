package kg.itacademy.lesson16;

public class Task1 {
    public static void main(String[] args) {
        int heigh = -5;
        Rectangle square = new Rectangle();
        square.setHeight(heigh);
        square.setWidth(heigh);
        square.setColor("Nujni svet");

        heigh = 5;
        square.setHeight(heigh);
        square.setWidth(heigh);

        System.out.println(square.getColor());
        System.out.println(square.getWidth());
        System.out.println(square.getHeight());
        System.out.println(square.getArea());
    }
}
