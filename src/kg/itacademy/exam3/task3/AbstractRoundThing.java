package kg.itacademy.exam3.task3;

public class AbstractRoundThing extends AbstractThing {
    private double radius;

    public AbstractRoundThing(String name, double radius, double height) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
