package DailyProgramP.Date1912;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ArrayElementRemoval {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,6,7,8,3,7,8};
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
        int output[] =removeSpecificElement(array,3);
        String output2[] =removeSpecificElementInbuild(arrayBeforeRemoval,3);

        System.out.println(Arrays.toString(output2));



    }
// Own method
    public static int [] removeSpecificElement(int array[], int index){

        for(int i =index; i<array.length-1;i++ ){
            array[i] =array[i+1];
        }
        array[array.length -1]= 0;

        return array;
    }

    //Inbuild method
    public static String [] removeSpecificElementInbuild(String array[], int index){
        String[] arrayAfterRemoval = ArrayUtils.remove(array, 2);
        String[] arrayAfterRemoval2 = ArrayUtils.removeElement(array, 2);
        return arrayAfterRemoval;
    }
}
