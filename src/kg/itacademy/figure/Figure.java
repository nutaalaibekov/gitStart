package kg.itacademy.figure;

public class Figure {
    private LocationOfFigure location;
    private String color;
    private boolean isVisible;

    public Figure(LocationOfFigure location, String color, boolean isVisible) {
        this.location = location;
        this.color = color;
        this.isVisible = isVisible;
    }

    public String speak() {
        return toString();
    }

    @Override
    public String toString() {
        return String.
                format("My location x: %s, y: %s, color: %s, i am %s visible",
                location.getX(), location.getY(), color, isVisible ? "" : "NOT");
    }
}
