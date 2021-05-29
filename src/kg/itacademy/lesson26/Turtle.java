package kg.itacademy.lesson26;

public class Turtle implements Carapaceble, EggLayable, Swimmable {
    @Override
    public void wearCarapace() {
        System.out.println("Turtle wearCarapace");
    }

    @Override
    public void layEgg() {
        System.out.println("Turtle layEgg");
    }

    @Override
    public void swim() {
        System.out.println("Turtle swim");
    }
}
