package kg.itacademy.lesson34;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    public boolean equals(Object otherObject) {
        if (this.hashCode() != otherObject.hashCode()) {
            return false;
        }
        if (otherObject instanceof Person) {
            Person otherPerson = (Person)otherObject;
            return this.name.equals(otherPerson.getName()) && this.age == otherPerson.getAge();
        } else {
            return false;
        }
    }
}
