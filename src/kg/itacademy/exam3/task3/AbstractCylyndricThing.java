package kg.itacademy.exam3.task3;

public class AbstractCylyndricThing extends AbstractThing {
    private double radius;
    private double height;

    public AbstractCylyndricThing(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
