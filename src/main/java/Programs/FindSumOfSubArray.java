package Programs;

public class FindSumOfSubArray {
    public static void main(String[] args) {
       // int array[] ={12, 5, 31, 9, 21, 8};
        int array[] ={42, 15, 12, 8, 6, 3};
        //int sum =45;
        int sum =26;
        int value=0;
        int startIndex =0;
        int j =0;

       // int indexerValue = array[j];

        for (int i = 0; i <array.length; i++) {
          if (value <sum){
              value = value+ array[i];
          }
          if(value >sum){
              value =value -array[j];
              j++;
              startIndex++;
          }

            if(value ==sum){
                System.out.println("Found the sub array :  Starting index "+startIndex + "  end index "+ i);
                break;
            }
        }
    }
}
