package kg.itacademy.lesson22;

public class Counter {
    private static int numOfCalls;
    public static void increment() {
        numOfCalls++;
        System.out.println(numOfCalls);
    }
}
