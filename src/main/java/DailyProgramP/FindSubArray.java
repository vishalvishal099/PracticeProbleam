package DailyProgramP;

public class FindSubArray {

    public static void main(String[] args) {
        int sum =33;
        int array[]  ={1,4,20,3,10,5};
        int checkSum=0;
        int leftPointer = 0, rightPointer = 0;
        /*
         iterative method
         */
//         for (int i=0; i< array.length; i++){
//             checkSum =array[i];
//             for (int j =i+1; j< array.length; j++){
//                 if(array[i]==sum){
//                     System.out.printf("");
//                 }else {
//                     if(checkSum < sum) {
//                         checkSum = checkSum + array[j];
//                     } else if(checkSum > sum){
//                         break;
//                     } else  if(checkSum ==sum){
//                         System.out.printf("Found sub array at  starting index " + i+  "  end index  " +j + "  " );
//                     }else
//                         System.out.printf("sub-array not found !!");
//                 }
//             }
//
//         }
         /*
         Effective methods !!
          */

        while (leftPointer < array.length ){
        if(checkSum ==sum){
            System.out.printf("Found subarray at " +leftPointer + "  "+rightPointer);
            break;
        }
         else if(checkSum < sum){
            checkSum = checkSum + array[rightPointer];
            rightPointer++;
        }else  if(checkSum > sum){
             checkSum = checkSum - array[leftPointer];
             leftPointer++;
        }
    }}
}
