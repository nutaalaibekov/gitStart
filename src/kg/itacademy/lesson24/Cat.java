package kg.itacademy.lesson24;

public class Cat extends AbstractFelins {

    public Cat(int nailsAmount, double trailLength , double mustacheLength, String color,double weight,int age) {
        super(nailsAmount, trailLength, mustacheLength,color ,weight, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void speak() {
        System.out.println("Myau");
    }

    @Override
    public String toString() {
        return String.format("Cat{%s, %s, %s, %s, %s, %s}", getNailsAmount() , getTrailLength(), getMustacheLength(), getAge() , getWeight(), getColor());
    }
}
