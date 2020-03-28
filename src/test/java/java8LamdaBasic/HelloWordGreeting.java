package java8LamdaBasic;

public class HelloWordGreeting implements  Greeting {
    @Override
    public void perform() {
        System.out.println("Hello word !!");
    }
}
