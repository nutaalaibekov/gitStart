package kg.itacademy.lesson25;

public class BlackBoard extends AbstractBoard implements Writable {

    @Override
    public void write() {
        System.out.println("Write with chalk");
    }

    public void blackDoing() {
        System.out.println("Write with markers");
    }
}
