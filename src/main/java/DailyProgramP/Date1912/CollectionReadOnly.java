package DailyProgramP.Date1912;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionReadOnly {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Vishal1");
        map.put(2,"Vishal2");
        map.put(3,"Vishal3");
        map.put(4,"Vishal4");
        map.put(5,"Vishal5");
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() +"  "+ entry.getValue());
        }
        Map<Integer, String> data = Collections.unmodifiableMap(map);
        data.put(6, "Updated value");
        for (Map.Entry<Integer, String> entry: data.entrySet()){
            System.out.println(entry.getKey() +"  "+ entry.getValue());
        }
    }


}
