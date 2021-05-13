package kg.itacademy.figure;

public class Main {
    public static void main(String[] args) {
        LocationOfFigure location = new LocationOfFigure(1, 1);
        Figure rectangle = new Figure(location, "black", true);
        LocationOfFigure location1 = new LocationOfFigure(100, 100);
        Figure triangle = new Figure(location1, "red", false);

        System.out.println(rectangle.speak());
        System.out.println(triangle.speak());
    }
}
