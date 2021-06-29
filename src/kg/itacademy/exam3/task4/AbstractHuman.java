package kg.itacademy.exam3.task4;

public abstract class AbstractHuman {
    private String name;
    private Language nativeLanguage;

    public AbstractHuman(String name, Language nativeLanguage) {
        this.name = name;
        this.nativeLanguage = nativeLanguage;
    }

    public abstract void greet(String name);

    public void go(double latitude, double longitude) {
        System.out.println(String.format("Добрался до точки (%s, %s).", latitude, longitude));
    }

}
