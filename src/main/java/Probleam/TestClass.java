package Probleam;

import java.util.Arrays;

public class TestClass {
    public static void main(String [] args){
        int [] arr ={ 2,1,0,2,1,0,0,1,2,0,0};
        int [] ref = new int [3];
        System.out.println(Arrays.toString(ref));
        for(int i=0; i<arr.length; i++)
            ref[arr[i]]++;

        System.out.println(Arrays.toString(ref));
    }
}
