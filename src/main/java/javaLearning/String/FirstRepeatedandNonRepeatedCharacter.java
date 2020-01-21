package javaLearning.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedandNonRepeatedCharacter {

    public static void FirstRepeatedandNonRepeatedCharacter(String s){
        char [] array = s.toCharArray();
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();

        for (char ch: array) {
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }else
                hashMap.put(ch, 1);
        }
       for (Map.Entry<Character,Integer> hm : hashMap.entrySet()) {
           if (hm.getValue() == 1) {
               System.out.println("Frist non repetable charter " + hm.getKey());
               break;
           }
       }
        for (Map.Entry<Character,Integer> hm2 : hashMap.entrySet()){
            if (hm2.getValue() >=2){
               System.out.println("Frist  repetable charter "+ hm2.getKey());
               break;
           }

        }

    }


    public static void main(String[] args) {
        FirstRepeatedandNonRepeatedCharacter("geeksforgeeks");
    }
}
