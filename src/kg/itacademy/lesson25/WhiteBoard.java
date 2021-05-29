package kg.itacademy.lesson25;

public class WhiteBoard extends AbstractBoard implements Writable, Movable {

    @Override
    public void write() {
        System.out.println("Write with markers");
    }

    public void doing() {
        System.out.println("Write with markers");
    }

    @Override
    public void move() {
        System.out.println("move with markers");
    }

    public void fly() {
        System.out.println("move with markers");
    }
}
