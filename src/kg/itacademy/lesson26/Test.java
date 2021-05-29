package kg.itacademy.lesson26;


public class Test {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Turtle turtle = new Turtle();
        Container toNY = new Container(turtle, chicken);
        toNY.transport();

        System.out.println(Swimmable.IS_SWIMMABLE);
        System.out.println(Swimmable.MAX_OCEAN_DEPTH);
        System.out.println(EggLayable.MAX_OCEAN_DEPTH);
        System.out.println(Carapaceble.MAX_OCEAN_DEPTH);
    }



}
