package kg.itacademy.lesson30;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat1");
        cats[1] = new Cat("Cat2");
        cats[2] = new Cat("Cat3");
        cats[3] = null;
        cats[4] = new Cat("Cat5");
        int count = 0;
        for(Cat cat : cats) {
            count++;
            System.out.println(cats[count].getName());
            System.out.println("End of CODE");
        }
    }
}