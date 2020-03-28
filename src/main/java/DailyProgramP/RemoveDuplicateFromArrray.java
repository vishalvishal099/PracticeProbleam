package DailyProgramP;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrray {
    private static Object HashSet;

    public static void main(String[] args) {
        char c[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'e' || c[i] == 'E') {
                continue;
            }
            System.out.println(c[i]);
        }
        int x = 0;
        do {
            x++;
            System.out.println(x);
            if (++x < 5)
                continue;
            x++;
            System.out.println(x);
        } while (++x < 10);
    }
}

