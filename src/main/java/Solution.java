import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>();

       List<Integer> arrRowItems = new ArrayList<>();

        arrRowItems.add(11);
        arrRowItems.add(2);
        arrRowItems.add(4);
        arr.add(arrRowItems);

        List<Integer> arrRowItems1 = new ArrayList<>();
        arrRowItems1.add(4);
        arrRowItems1.add(5);
        arrRowItems1.add(6);
        arr.add(arrRowItems1);
        List<Integer> arrRowItems2 = new ArrayList<>();

        arrRowItems2.add(10);
        arrRowItems2.add(8);
        arrRowItems2.add(-12);
        arr.add(arrRowItems2);
        System.out.println(arr);


        int data1 =0;
        int data2 =0;
        int length = arr.size();
        for(int i=0; i<length; i++){
            data1 = data1 + arr.get(i).get(i);
            data2 = data2 + arr.get(i).get(length-1-i);
        }
        int data3 = data1 - data2;

        System.out.println(Math.abs(data3));
    }


}

