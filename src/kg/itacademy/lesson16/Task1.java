package kg.itacademy.lesson16;

public class Task1 {
    public static void main(String[] args) {
        Rectangle square = new Rectangle();
        square.setHeight(6);
        square.setWidth(6);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(100);
        rectangle1.setHeight(50);

        System.out.println(square.getArea());
        System.out.println(rectangle1.getArea());

    }
}
