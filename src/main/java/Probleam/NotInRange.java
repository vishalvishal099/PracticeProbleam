package Probleam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotInRange {
    public static void main(String[] args) throws IOException {

//
//        int array[] = new int[11];
//
//        Scanner scan = new Scanner(System.in);
//        int numberOfRecord = scan.nextInt();
//        for (int i=1; i<=numberOfRecord; i++){
//
//            int start =scan.nextInt();
//            int end   = scan.nextInt();
//            array[start -1]= -1;
//            array[end]=1;
//        }
//
//        int couter=0;
//        int sum=0;
//        for (int i=0; i<array.length -1 ;i++){
//            couter = couter + array[i];
//            if(couter ==0){
//                sum = sum+1 +i ;
//            }
//
//        }
//        System.out.println(sum);

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter wr = new PrintWriter(System.out);
                int n = Integer.parseInt(br.readLine().trim());
                int[] L = new int[n];
                int[] R = new int[n];
                for(int i_L=0; i_L<n; i_L++)
                {
                    String[] tmp = br.readLine().split(" ");
                    L[i_L] = Integer.parseInt(tmp[0]);
                    R[i_L] = Integer.parseInt(tmp[1]);

                }

                long out_ = NotinRange(R, L, n);
                System.out.println(out_);

                wr.close();
                br.close();
            }
            static long NotinRange(int[] L,int[] R, int n){
                int[] fArr = new int[1000001];
                long sum =0;
                for(int i=0;i<=1000000;i++){
                    fArr[i] = i;
                }
                for(int j=0;j<n;j++){
                    if(fArr[L[j]]==0 && fArr[R[j]]==0){
                        continue;
                    }
                    for(int k=L[j];k<=R[j];k++){
                        fArr[k] =0;
                    }
                }
                for(int m=0;m<=1000000;m++){
                    sum = sum + fArr[m];
                }
                return sum;
            }
}
