package Programs;

public class Factorial {
    public static void main(String[] args) {
        int num =6;
        int temp = num;
        int sum = 0;

        for (int i =1;  i<= num; i++){
            if(num -i == 0 ){
                break;
            }
            temp = temp * (num-i);
        }
        System.out.println(temp);
        num =1;
        int prime = isPrime(num,num/2);
        if(prime ==1){
            System.out.println("Prime");
        }else System.out.println("Not prime");
    }


    public static int isPrime(int num, int i){
        if(i==1){
            return 1;
        }else if (num %i ==0){
            return 0;
        }else
            return isPrime(num, i-1);

    }
}
