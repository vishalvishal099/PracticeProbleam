package javaLearning.MultiTherading;

public class ExtendThread extends Thread{

    public void run(){
        System.out.println("Run function called ");
    }

    public static void main(String[] args) {

        ExtendThread ex = new ExtendThread();
        ex.start();

    }
}
