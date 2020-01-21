package Programs;

import java.util.*;

public class ComprableAndComparator {

    public static void main(String[] args) {

        List<Laptop> ls = new ArrayList<>();
        ls.add(new Laptop("Dell", 4, 500));
        ls.add(new Laptop("Apple", 4, 256));
        ls.add(new Laptop("Acer", 4, 501));

        Comparator<Laptop>  com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop ls1, Laptop ls2) {
                if(ls1.getHardDisk() > ls2.getHardDisk()){
                 return  1;
                }else {
                    return -1;
                }
            }
        };
        Collections.sort(ls,com);
        for(Laptop l : ls){
            System.out.println(l);
        }

    }
}