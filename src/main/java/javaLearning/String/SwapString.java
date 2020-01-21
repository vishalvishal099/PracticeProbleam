package javaLearning.String;

import java.util.Arrays;

public class SwapString {

    public static void main(String[] args) {
        String s1= "Vishal";
        System.out.println(swap( s1, 0,5));


    }

    public static String swap(String s1, int a, int b){
         char arr[] =s1.toCharArray();
          char temp = arr[a];
          arr[a] =arr[b];
          arr[b] = temp;
           String s = Arrays.toString(arr);
        System.out.println(String.valueOf(arr));
        return s;
    }
}
