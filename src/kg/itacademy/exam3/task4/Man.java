package kg.itacademy.exam3.task4;

import kg.itacademy.exam3.task3.AbstractThing;

import java.util.HashSet;
import java.util.Set;

public class Man extends AbstractHuman {
    private final Set<AbstractThing> pocket1 = new HashSet<>();
    private final Set<AbstractThing> pocket2 = new HashSet<>();

    public Man(String name, Language nativeLanguage) {
        super(name, nativeLanguage);
    }

    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public boolean addToPocket1(AbstractThing abstractThing) {
        return pocket1.add(abstractThing);
    }

    public boolean addToPocket2(AbstractThing abstractThing) {
        return pocket2.add(abstractThing);
    }

    public Set<AbstractThing> getPocket1() {
        return pocket1;
    }

    public Set<AbstractThing> getPocket2() {
        return pocket2;
    }

    public void shakePockets() {
        for(AbstractThing thing : pocket1) {
            if (thing instanceof Ringing) {
                ((Ringing)thing).ring();
            }
            if (thing instanceof Paperable) {
                ((Paperable)thing).fold();
            }
        }
        for(AbstractThing thing : pocket2) {
            if (thing instanceof Ringing) {
                ((Ringing)thing).ring();
            }
            if (thing instanceof Paperable) {
                ((Paperable)thing).fold();
            }
        }
    }
}
