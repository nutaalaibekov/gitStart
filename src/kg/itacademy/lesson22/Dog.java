package kg.itacademy.lesson22;

public class Dog {
    private String name;
    private double weight;
    private int age;

    private static int dogsCount;

    public Dog(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        dogsCount++;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

}
