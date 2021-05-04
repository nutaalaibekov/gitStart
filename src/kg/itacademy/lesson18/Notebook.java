package kg.itacademy.lesson18;

public class Notebook {
    Hdd hdd;
    Ram ram;
    Os os;
    Cpu cpu;

    public Notebook(Hdd hdd, Ram ram, Os os, Cpu cpu) {
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", os=" + os +
                ", cpu=" + cpu +
                '}';
    }
}
