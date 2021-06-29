package kg.itacademy.exam3.task4;

import kg.itacademy.exam3.task3.AbstractCylyndricThing;

public class Coin extends AbstractCylyndricThing implements Ringing {

    public Coin(String name, double radius, double height) {
        super(name, radius, height);
    }

    @Override
    public void ring() {

    }
}
