package kg.itacademy.lesson25;

public class Main {
    public static void main(String[] args) {

        handleWrite(new WhiteBoard());
        handleWrite(new BlackBoard());
        handleMovable(new WhiteBoard());

    }

    public static void handleWrite(Writable writable) {
        writable.write();
    }

    public static void handleMovable(Movable writable) {
        writable.move();
    }
}
