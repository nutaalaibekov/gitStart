package kg.itacademy.lesson16;

public class Cat {
    String name;
    int age;

    public Cat(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return String.format("My name is %s, i am %s", name, age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
