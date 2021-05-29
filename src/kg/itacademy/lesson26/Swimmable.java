package kg.itacademy.lesson26;

public interface Swimmable {
    boolean IS_SWIMMABLE = true;
    double MAX_OCEAN_DEPTH = 7000;

    default void swim() {
        System.out.println("Shlep shelp !!!");
    }
}
