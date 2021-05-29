package kg.itacademy.lesson24;

public class Cow extends AbstractAnimal{

    public static void method() {
        System.out.println("Method");
    }

    public static void main(String[] args) {
        Cow burka = new Cow("Black", 5.0, 3);
        burka.method();
    }

    public Cow(String color,double weight,int age) {
        super(color, weight, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void speak() {
        System.out.println("Muu");
    }

    @Override
    public String toString() {
        return String.format("Cow{%s, %s, %s}", getAge() , getWeight(), getColor());
    }
}
