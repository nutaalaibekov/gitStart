package kg.itacademy.lesson26;


public class Test {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Turtle turtle = new Turtle();
        Container toNY = new Container(turtle, chicken);
        toNY.transport();
    }



}
