package kg.itacademy.lesson27;

public class Shark implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Shark swimming");
    }

    @Override
    public void makeNois() {
        System.out.println("Shark maiking noise");
    }

    public void hunt() {
        System.out.println("Shark hunting");
    }
}
