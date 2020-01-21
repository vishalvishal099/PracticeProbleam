package Probleam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int counter = 0;
        int i=0;
        String s = "Vishal";
        char [] s2 ={'V','i','s','h','a','l'};
        System.out.println(s.length() + "length of String   " + s2.length);
        System.out.println(c.length);
        while(i < c.length -1) {
            if(i+ 2 ==c.length && c[c.length -1]==1){
                i++;
                break;
            }
            if (i+ 2 ==c.length ||  c[i + 2] == 1 ) {
                i++;
                counter++;
            } else{
                i += 2;
                counter++;
            }
            }

        return counter;
    }


    public static void main(String[] args) {
        int  arr[]= {0, 0, 1, 0, 0, 0, 0, 1, 0, 1};
        System.out.println(jumpingOnClouds(arr));
    }
}
