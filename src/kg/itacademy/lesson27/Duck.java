package kg.itacademy.lesson27;

public class Duck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }

    @Override
    public void makeNois() {
        System.out.println("Duck maiking noise");
    }
}
