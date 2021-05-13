package kg.itacademy.lesson22;

public class Counter {
    private static int numOfCalls;
    public static void increment() {
        numOfCalls++;
        System.out.println(numOfCalls);
    }
    public static int factorial() {
        int factorial = 1;
        for(int i = 1; i <= numOfCalls; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial = " + factorial);
        return factorial;
    }
}
