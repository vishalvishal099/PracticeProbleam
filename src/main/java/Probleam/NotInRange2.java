package Probleam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

public class NotInRange2 {

    public static void main(String[] args) throws IOException {


        HashSet<Integer> hashSet = new HashSet<>();
        int hashSum = 0;
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int input = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < input; i++) {
            String[] range = br.readLine().split(" ");
            for (int j = Integer.parseInt(range[0]); j <= Integer.parseInt(range[1]); j++) {
                if (! hashSet.contains(j)) {

                    hashSet.add(j);
                    hashSum = hashSum + j;
                }
            }
        }


        int arr[] = new int[10000001];
        for (int k = 0; k <= 1000000; k++) {
            arr[k] = k;
            sum = sum + k;

        }


        System.out.println(sum - hashSum);

    }
}