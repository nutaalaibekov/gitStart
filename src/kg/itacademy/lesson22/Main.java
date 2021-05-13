package kg.itacademy.lesson22;

public class Main {
    public static void main(String[] args) {
        Dog barbos = new Dog("Barbos", 20, 2);
        Dog rex = new Dog("Rex", 20, 2);
        Dog muhtar = new Dog("Muhtar", 20, 2);
        Dog muhtar1 = new Dog("Muhtar", 20, 2);

        System.out.println("Dogs count = " + Dog.getDogsCount());
    }
}
