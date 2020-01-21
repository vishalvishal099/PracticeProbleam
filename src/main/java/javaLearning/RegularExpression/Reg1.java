package javaLearning.RegularExpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        int counter =0;
       for(int i = 3; i > counter; i-- ){
           set.add("Window"+i);;
       }
        System.out.println(set);

        Iterator<String> s = set.iterator();



        List<String> al = new ArrayList<String>();
       int counterAL =3;
       for(int i=0; i<= counterAL; i++){
            al.add("Window"+i);
       }

        System.out.println("arraylist help "+ al.get(3));

        String sv = "STR";
        System.out.println(sv.length());

       char []a=  sv.toCharArray();
        System.out.println( a.length);
    }
}
