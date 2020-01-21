package javaLearning.ExeptionHandling;

public class RunnerInterface implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println("Runner interfce called Tesing ");
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        RunnerInterface rn = new RunnerInterface();
        Thread t = new Thread(rn);
        t.start();
    }
}
