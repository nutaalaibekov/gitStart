package kg.itacademy.lesson27;

public class Dolphin implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Dolphin swimming");
    }

    @Override
    public void makeNois() {
        System.out.println("Dolphin making noise");
    }
}
