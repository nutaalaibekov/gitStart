package kg.itacademy.lesson24;

public abstract class AbstractAnimal {
    private String color;
    private double weight;
    private int age;

    public AbstractAnimal(String color,double weight,int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void speak();

    public void rest() {
        sleep();
        eat();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
