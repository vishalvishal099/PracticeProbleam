package Programs;

import java.util.HashMap;

public class AnagramString {

    public  static void checkAnagaram(String s1, String s2){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        char firstInput[] = s1.toCharArray();
        char secondInput[] = s2.toCharArray();


        for (char c: firstInput) {

            if(hm1.containsKey(c)){
                hm1.put(c, hm1.get(c) + 1);
            }else {
                hm1.put(c, 1);
            }
        }

        for (char c2: secondInput) {
            if(hm2.containsKey(c2)){
                hm2.put(c2, hm2.get(c2) +1);
            }else{
                hm2.put(c2,1);
            }

        }


        if(hm1.equals(hm2)) {
            System.out.println("String is anagram");
        }else  {
            System.out.println("Not anagram ");
        }
    }

    public static void main(String[] args) {
        checkAnagaram("test", "estt");
    }
}
