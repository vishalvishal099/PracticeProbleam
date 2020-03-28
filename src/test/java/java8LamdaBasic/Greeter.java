package java8LamdaBasic;

public class Greeter {

    public void greet(Greeting greeting){
        System.out.println(greeting);
    }
    public static void main(String[] args) {
       Greeter greeter = new Greeter();
       HelloWordGreeting helloWordGreeting = new HelloWordGreeting();
       helloWordGreeting.perform();
       //greeter.greet();
    }
}
