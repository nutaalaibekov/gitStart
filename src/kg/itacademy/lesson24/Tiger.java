package kg.itacademy.lesson24;

public class Tiger extends AbstractFelins{

    public Tiger(int nailsAmount, double trailLength , double mustacheLength, String color,double weight,int age) {
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
        System.out.println("RRRRR !!!");
    }

    @Override
    public String toString() {
        return String.format("Tiger{%s, %s, %s, %s, %s, %s}", getNailsAmount() , getTrailLength(), getMustacheLength(), getAge() , getWeight(), getColor());
    }
}

