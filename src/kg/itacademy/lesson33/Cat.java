package kg.itacademy.lesson33;

public class Cat {
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.age + name.hashCode();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this.hashCode() != otherObject.hashCode()) {
            return false;
        }

        // TODO: implement equals

        return this.hashCode() == otherObject.hashCode();
    }
}
