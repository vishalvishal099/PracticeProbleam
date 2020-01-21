package Programs;
//Write a Java Program to count the number of words in a string using HashMap.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        String s = "Test";
        for (int i=0;i<=s.length()-1;i++){
            arrayList.add(s.charAt(i));
        }
        for(Object obj:arrayList){
            System.out.println(obj);
        }

        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
