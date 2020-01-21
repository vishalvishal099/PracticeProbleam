package Programs.QuestionPaper;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromAry {
    public static void main(String[] args) {

        /* METHOD 1:
        Method one where I am iterating arrray and putting the arrays value to set and printing set
        set store only unique records
         */
        int array[] ={1,1,1,2,3,2,3,4,5};

        Set<Integer> set = new HashSet<>();
        for (int i =0; i< array.length; i++){

            if(set.add(array[i])){

            }else
                System.out.println("Duplicate found at index "+ i+ "  and Value is  "+array[i]);
        }

        System.out.println(set);
        for(Integer data : set){
            System.out.println(data + "  hash data");
        }

              /* METHOD 2:
        Method one where I am iterating arrray and putting the arrays value to set and printing set
        set store only unique records
         */
       String input ="Java Concept Of The Day";
             String [] dataAfterSplit= input.split("");
        System.out.println(dataAfterSplit);
        System.out.println(dataAfterSplit.length);
          for (String s: dataAfterSplit){
              System.out.println(s);
          }
    }
}
