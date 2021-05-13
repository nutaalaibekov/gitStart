package kg.itacademy.figure;

public class Main {
    public static void main(String[] args) {
        LocationOfFigure location1 = new LocationOfFigure(100, 100);
        Figure figure = new Figure(location1, "red", false);

        LocationOfFigure location2 = new LocationOfFigure(300, 100);
        Rectangle rectangle = new Rectangle(location2, "red", false, 100, 200);

        System.out.println(figure.speak());
        System.out.println(rectangle.speak());
    }
}
