package javaLearning.MultiTherading;

class  Hi extends  Thread {
    public void run(){

        for (int i=0; i<5; i++){
            try {
                System.out.println("Hi");
                System.out.println("Running thread name :" + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
                Thread.sleep(400);
            }catch (Exception e){

            }
        }
    }

}
class Hello extends  Thread{
    public void run(){
        for (int i=0; i<5; i++){
            try {
                System.out.println("Hello");
                System.out.println("Thread name : "+ Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
                Thread.sleep(400);
            }catch (Exception e){

            }
        }
    }

}

public class JoinAndIsAlive  {
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.setPriority(Thread.MIN_PRIORITY);
        hi.setPriority(Thread.MAX_PRIORITY);
        hi.setName("M");
        hello.setName("N");
        hi.start();
        hello.start();
        hi.join();
        hello.join();

        System.out.println("Bye");
    }
}
