package kg.itacademy.lesson24;

public class Main {
    public static void main(String[] args) {
        Cat matroskin = new Cat( 18,  20 ,  5,  "Black", 5.0, 3);
        Tiger jinga = new Tiger( 18,  20 ,  5,  "Black", 5.0, 3);
        Cow burka = new Cow("Black", 5.0, 3);

        System.out.println(matroskin);
        System.out.println(jinga);
        System.out.println(burka);

        matroskin.speak();
        jinga.speak();
        burka.speak();

        burka.method();
    }
}
