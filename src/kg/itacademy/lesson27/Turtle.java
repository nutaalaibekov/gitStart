package kg.itacademy.lesson27;

public class Turtle implements Swimmable {

    @Override
    public void swim() {
        System.out.println("Turtle swimming");
    }

    @Override
    public void makeNois() {
        System.out.println("Turtle maiking noise");
    }

    public void layEggs(int eggsCount) {
        System.out.println("Turtle lays eggs " + eggsCount);
    }
}
