package DesignPattern.BuilderDesignPattern;

public class Phone {
    private String OS;
    private int ram;
    private double screenSize;
    private String processor;
    private String camera;
    private String brand;
    private int battery;

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                ", processor='" + processor + '\'' +
                ", camera='" + camera + '\'' +
                ", brand='" + brand + '\'' +
                ", battery=" + battery +
                '}';
    }

    public Phone(String OS, int ram, double screenSize, String processor, String camera, String brand, int battery) {
        this.OS = OS;
        this.ram = ram;
        this.screenSize = screenSize;
        this.processor = processor;
        this.camera = camera;
        this.brand = brand;
        this.battery =battery;
    }
}
