package DailyProgramP.Date1912;

import java.util.Arrays;

public class ArrayRotationByPosition {
    private static void leftRotate(int[] inputArray, int n) {
        System.out.println("Input Array Before Rotation :");

        System.out.println(Arrays.toString(inputArray));

        for(int i =0; i<n; i++){

            int temp = inputArray[i];
            for (int i1; i<inputArray.length -1; i++){
                inputArray[i] =inputArray[i+1];
            }
            inputArray[inputArray.length -1] =temp;
        }
        System.out.println("Input Array After Left Rotation By " + n + " Positions :");

        System.out.println(Arrays.toString(inputArray));
    }

    public static void leftRotateMy(int [] array, int n){
        int leftData[] = new int[n];
        for(int i=0; i<n;i++){
            leftData[i] =array[i];
        }
        for (int i =0; i<array.length -2;i++) {
            array[i] = array[i+2];
        }
        for(int i=0; i<n;i++){
            array[array.length -2 + i]=leftData[i];
        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
       leftRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
        leftRotateMy(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);

    }

}
