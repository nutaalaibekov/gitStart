package kg.itacademy.exam3.task2;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + patronymic.hashCode();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (this.hashCode() != otherObject.hashCode()) {
            return false;
        }

        if (otherObject instanceof Person) {
            Person otherPerson = (Person)otherObject;
            return otherPerson.getName().equals(this.name) && otherPerson.getSurname().equals(this.surname) && otherPerson.getPatronymic().equals(this.patronymic);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}

