package DailyProgramP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Integer [] arr = {2,2,3,20,30,3,4,5,6,2,4,5,9,0,20};
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(hashSet);
    }
}
