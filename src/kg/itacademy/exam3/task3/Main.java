package kg.itacademy.exam3.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Backpack backpack1 = new Backpack(new Book("Zero", 10, 30), new CocaCola("Zero", 10, 30), new ArrayList<>());
        backpack1.addRoundThing(new Apple("Aport", 10, 15));
        backpack1.addRoundThing(new Apple("Aport", 10, 15));
        backpack1.addRoundThing(new Apple("Aport", 10, 15));
        backpack1.addRoundThing(new Apple("Aport", 10, 15));
        Backpack backpack2 = new Backpack(new Folder("Black", 10, 30), new BottleOfWater("Legend", 10, 30), new ArrayList<>());
        backpack2.addRoundThing(new TennisBall("TennisBest", 10, 15));
        backpack2.addRoundThing(new TennisBall("TennisBest", 10, 15));
        backpack2.addRoundThing(new TennisBall("TennisBest", 10, 15));
        backpack2.addRoundThing(new TennisBall("TennisBest", 10, 15));
        Backpack backpack3 = new Backpack(new Book("Zero", 10, 30), new CocaCola("Zero", 10, 30), new ArrayList<>());
        backpack3.addRoundThing(new TennisBall("TennisBest", 10, 15));
        backpack3.addRoundThing(new TennisBall("TennisBest", 10, 15));
        backpack3.addRoundThing(new TennisBall("TennisBest", 10, 15));
        backpack3.addRoundThing(new Apple("TennisBest", 10, 15));
        backpack3.addRoundThing(new Apple("TennisBest", 10, 15));
        backpack3.addRoundThing(new Apple("TennisBest", 10, 15));
    }
}



