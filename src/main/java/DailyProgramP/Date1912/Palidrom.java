package DailyProgramP.Date1912;

public class Palidrom {
    public static void main(String[] args) {
        String input = "rotator";
       boolean result=  checkPalidrom(input);
    }


     public  static boolean checkPalidrom(String input) {

         if (input.length() < 2) {
             return true;
         }
         if(input.charAt(0)!=input.charAt(input.length() -1)){
             return false;
         }else
             return checkPalidrom(input.substring(1,input.length()-1));


     }
}
