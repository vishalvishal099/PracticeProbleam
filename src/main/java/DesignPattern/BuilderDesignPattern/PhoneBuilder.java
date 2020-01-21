package DesignPattern.BuilderDesignPattern;

public class PhoneBuilder {
    private  String OS;
    private int ram;
    private double screenSize;
    private String processor;
    private String camera;
    private String brand;
    private int battery;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

     public Phone getPhone(){
        return new Phone(OS,ram,screenSize,processor,camera,brand,battery);
     }
}
