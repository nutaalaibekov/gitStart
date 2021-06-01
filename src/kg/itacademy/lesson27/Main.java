package kg.itacademy.lesson27;

public class Main {
    public static void main(String[] args) {
        Swimmable swimmableShark = new Shark();
        Swimmable swimmableTurtle = new Turtle();
        Swimmable[] swimmables = new Swimmable[3];
        swimmables[0] = new Turtle();
        swimmables[1] = new Shark();
        swimmables[2] = new Turtle();

        for(Swimmable swimmable : swimmables) {
            if (swimmable instanceof Shark) {
                ((Shark) swimmable).hunt();
            }
            if (swimmable instanceof Turtle) {
                ((Turtle) swimmable).layEggs(4);
            }
        }
    }

}
