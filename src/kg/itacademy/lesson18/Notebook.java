package kg.itacademy.lesson18;

public class Notebook {
    Hdd hdd;
    Ram[] ram;
    Os os;
    Cpu cpu;

    public Notebook(Hdd hdd, Ram[] ram, Os os, Cpu cpu) {
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

    public Ram[] getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "hdd=" + hdd +
                ", ram=" + getRams() +
                ", os=" + os +
                ", cpu=" + cpu +
                '}';
    }

    public String getRams() {
        String rams = "";
        for(Ram item : ram) {
            rams = rams + " " + item;
        }
        return rams;
    }
}
