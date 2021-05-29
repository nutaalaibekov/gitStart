package kg.itacademy.lesson26;

public class Container {
    private Swimmable swimmable;
    private EggLayable eggLayable;

    public Container(Swimmable swimmable, EggLayable eggLayable) {
        this.eggLayable = eggLayable;
        this.swimmable = swimmable;
    }

    public void transport() {

    }
}
