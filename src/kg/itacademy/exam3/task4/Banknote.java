package kg.itacademy.exam3.task4;

import kg.itacademy.exam3.task3.AbstractFlatThing;

public class Banknote extends AbstractFlatThing implements Paperable {
    public Banknote(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public void burn() {

    }

    @Override
    public void fold() {

    }

    @Override
    public void tear() {

    }
}
