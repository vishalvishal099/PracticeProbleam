package Programs;

import java.util.Scanner;

public class FindTheMissingNumber {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int scan = scanner.nextInt();
//
//        for (int j = 1; j <= scan; j++) {
//            int size = scanner.nextInt();
//           int array[] = new int[size];
//            for (int x =0; x < size; x++) {
//                array[x] = scanner.nextInt();
//            }
        int array[] = { 1, 2, 4, 5, 6 };
        int size =5;
            int x1 = array[0];

            // For xor of all the elements from 1 to n+1
            int x2 = 1;

            for (int i = 1; i < size; i++)
                x1 = x1 ^ array[i];

            for (int i = 2; i <= size + 1; i++)
                x2 = x2 ^ i;

            System.out.println(x1 ^ x2);
//            int total = (size*(size+1))/2;
//            System.out.println(total -sum);


        }
    }
//}
