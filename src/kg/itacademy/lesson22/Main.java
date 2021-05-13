package kg.itacademy.lesson22;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        Counter.increment();
        Counter.increment();
        Counter.increment();

        Counter counter12 = new Counter();
        Counter counter22 = new Counter();

        Counter.increment();
        Counter.increment();
        Counter.increment();

        Counter.factorial();
    }
}
