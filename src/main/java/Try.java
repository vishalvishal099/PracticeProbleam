import java.util.Stack;

public class Try {

    public static void main(String[] args) {
        boolean isPrime = true;
        int n =10;
        Stack stack = new Stack();
        for(int i=2; i< n/2; i++){
            if(i%2 ==0){
              isPrime =false;
            }

        }
        System.out.println("primeNumber");
    }
}