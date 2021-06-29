package kg.itacademy.exam3.task4;

public class Main {
    public static void main(String[] args) {
        Man me = new Man("Nursultan", Language.KYRGYZ);
        me.addToPocket1(new Coin("Quarter", 1, 0.2));
        me.addToPocket2(new Banknote("50 EURO", 10, 5));
        me.shakePockets();
    }
}
