package DailyProgramP.Date1912;

public class PrimeNumber {
    public static void main(String[] args) {
        int number =41;
        int counter=0;
        if (number <= 1) {
            counter++;
        }
        for (int i=2; i <=number/2; i++ ){
            if(number % i ==0){
                counter++;
            }
        }
        if (counter >=1){
            System.out.println("Non Prime number");
        } else
            System.out.println("Prime number");
    }
}
