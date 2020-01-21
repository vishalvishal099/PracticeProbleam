package DesignPattern.BuilderDesignPattern;

public class Shop {
    public static void main(String args[]){

        //Phone p = new Phone("Android",4,5.5,"Meditek","8MP","Nokia",4000);
        Phone p = new PhoneBuilder().setOS("Android").setBattery(4000).getPhone();
        System.out.println(p);
    }
}
