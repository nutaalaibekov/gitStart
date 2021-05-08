package kg.itacademy.lesson20.inside;

import kg.itacademy.lesson20.outside.OutsideClass;

public class Main {
    public static void main(String[] args) {
        InsideClass insideClass = new InsideClass();
        insideClass.privateField = 1;
        insideClass.defaoultField = 1;
        insideClass.publicField = 1;
        insideClass.protectedField = 1;

        insideClass.privatemethod();
        insideClass.publicmethod();
        insideClass.defaultmethod();

        OutsideClass outsideClass = new OutsideClass();
        outsideClass.privateField = 1;
        outsideClass.defaoultField = 1;
        outsideClass.publicField = 1;
        outsideClass.protectedField = 1;

        outsideClass.privatemethod();
        outsideClass.defaultmethod();
        outsideClass.publicmethod();

        InheritOutsideCass inheritOutsideCass = new InheritOutsideCass();
        inheritOutsideCass.privateField = 1;
        inheritOutsideCass.defaoultField = 1;
        inheritOutsideCass.publicField = 1;
        inheritOutsideCass.protectedField = 1;

    }
}
