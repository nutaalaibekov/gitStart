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

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public void setOs(Os os) {
        this.os = os;
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
