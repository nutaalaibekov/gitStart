package kg.itacademy.exam3.task3;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private AbstractFlatThing flatThing;
    private AbstractCylyndricThing cylyndricThing;
    private final List<AbstractRoundThing> roundThings;


    public Backpack(AbstractFlatThing flatThing, AbstractCylyndricThing cylyndricThing, List<AbstractRoundThing> roundThings) {
        this.flatThing = flatThing;
        this.cylyndricThing = cylyndricThing;
        this.roundThings = roundThings;
    }

    public AbstractFlatThing getFlatThing() {
        return flatThing;
    }

    public void setFlatThing(AbstractFlatThing flatThing) {
        this.flatThing = flatThing;
    }

    public AbstractCylyndricThing getCylyndricThing() {
        return cylyndricThing;
    }

    public void setCylyndricThing(AbstractCylyndricThing cylyndricThing) {
        this.cylyndricThing = cylyndricThing;
    }

    public List<AbstractRoundThing> getRoundThings() {
        List<AbstractRoundThing> list = new ArrayList<>(roundThings);
        return list;
    }

    public boolean addRoundThing(AbstractRoundThing abstractRoundThing) {
        return roundThings.add(abstractRoundThing);
    }
}
