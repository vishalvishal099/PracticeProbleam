package Probleam;

import java.util.Scanner;

public class CountingValleys {

    public static  int countingVally(int n, String input){

        int counter =0;
        int vally =0;
        for (int i =0; i< n;i++){
            char in = input.charAt(i);

            if(in =='U'){
                counter ++;
                if(counter ==0){
                    vally++;
            }

            }else
                counter--;
        }
        return vally;
    }

    public static  void main(String args[]){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter steps ");
//        int steps = scanner.nextInt();
//
//        System.out.println("Enter string ");
//        String inputString = scanner.next();

        System.out.println(countingVally(8,"UDDDUDUU"));
    }
}
