package Probleam;

import java.util.Scanner;

public class BeautifulString {

//    public  void findBeutifulString(String s){
//         String subString ="";
//         boolean isValid = false;
//         for (int i=1; i<s.length()/2; i++){
//          subString = s.substring(0,i);
//          Long num = Long.parseLong(subString);
//          String validString = subString;
//          while (validString.length() < s.length()){
//           validString += Long.toString(++num);
//          }
//          if(s.equals(validString)){
//              isValid = true;
//              break;
//          }
//         }
//        System.out.println(isValid ? "Yes " + subString  :"No" );
//    }















    public  void findBeutifulString(String s){
        boolean isValidString  = false;
        String subString ="";
        for (int i =1; i<=s.length()/2; i++){
            subString = s.substring(0,i);
            Long num = Long.parseLong(subString);
            String validString = subString;

            while (validString.length() < s.length()){
                validString += Long.toString(++num);
            }

            if(validString.equals(s)){
                isValidString =true;
                break;
            }
        }

        System.out.println(isValidString? "Yes   " + subString : "NO");

    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        BeautifulString b = new BeautifulString();
        b.findBeutifulString(Integer.toString(q));
    }
}
