package kg.itacademy.lesson26;

public interface Swimmable {

    default void swim() {
        System.out.println("Shlep shelp !!!");
    }
}
