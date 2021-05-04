package kg.itacademy.lesson18;

public class Main {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(2048, 720);
        Ram ram =  new Ram(4096, "DDR4");
        Os os = new Os("Widnows", "10");
        Cpu cpu = new Cpu("INtel", 8, 2.5);
        Notebook myNotebook = new Notebook(hdd, ram, os, cpu);

        System.out.println(myNotebook);
    }
}
