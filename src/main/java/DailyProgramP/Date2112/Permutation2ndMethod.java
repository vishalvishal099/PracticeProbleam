package DailyProgramP.Date2112;

public class Permutation2ndMethod {

    public static void main(String[] args) {
        String testData ="abc";
        int length = testData.length();
          permute(testData,0, length-1);
    }
    public static  void  permute(String testData, int l, int r){

        if(l ==r){
            System.out.println(testData);
        }else {
            for (int i=l;  i<=r; i++){
                testData = swap(testData, l, i);
                permute(testData, l +1,r);
                testData = swap(testData, l, i);
            }
        }

    }

     public  static String swap(String testdata, int i, int j ){
        char temp;
        char [] inputData = testdata.toCharArray();
         temp = inputData[i];
         inputData[i] = inputData[j];
         inputData[j] = temp;
      return String.valueOf(inputData);
     }
}
