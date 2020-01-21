package Probleam;

public class RepeatedString {
    public static void main(String[] args) {
        String input = "aba";
        long n = 10L;
        System.out.println(repeatedString(input,n));
    }


      private  static long repeatedString(String s, long n){
        char [] charArray = s.toCharArray();
        long counter=0;
        long extraLength =0;
        int length = s.length();

          for(int i =0; i<charArray.length; i++){
              if(charArray[i]=='a'){
               counter++;
              }
          }
             long numberOfTimeStringOccurance = n/length;
             long overFlowChar =n % length;
             if(overFlowChar ==-1){
                 overFlowChar =0;
             }

             String subString = s.substring(0,(int)overFlowChar);
             char [] subStringArr = subString.toCharArray();

              for(int i1 =0; i1<subStringArr.length; i1++) {
                  if (charArray[i1] == 'a') {
                      extraLength++;
                  }
              }
           counter = numberOfTimeStringOccurance * counter + extraLength;

        return counter;

      }
//    private static long repeatedString(String s, long n) {
//        int counter =0;
//        StringBuilder stringBuilder = new StringBuilder(s);
//
//        while (stringBuilder.length() < n){
//            stringBuilder.append(s);
//        }
//        String finalInput = stringBuilder.substring(0, Math.toIntExact(n));
//
//        char[] inputArray = finalInput.toCharArray();
//
//        for (int i =0; i <inputArray.length; i++){
//            if(inputArray[i] =='a'){
//                counter++;
//            }
//        }
//
//
//      return counter;
//    }
}
