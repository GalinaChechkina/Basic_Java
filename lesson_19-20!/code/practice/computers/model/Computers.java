package practice.computers.model;

public class Computers {
    private String cpu;
    private int ram;
    private int hdd;
    private String brand;

    public Computers(String cpu, int ram, int hdd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override  // переопределение родительского метода от класса Object
    public String toString() {
        return "Computers { " +
                " cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", brand='" + brand + '\'' +
                '}';
    }

}
