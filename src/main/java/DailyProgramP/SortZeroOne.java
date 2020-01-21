package DailyProgramP;

import java.util.Arrays;

public class SortZeroOne {
    public static void main(String args[]){
        int array[] ={0,1,0,0,1,1,1,1};
        int start =0;
        int end = array.length -1;
        while (start < end){
            while (array[start] ==0 && start < end){
                start++;
            }
           while (array[end] ==1 && start < end){
                end--;
            }
            if(start < end){
                array[start]=0;
                array[end] =1;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
