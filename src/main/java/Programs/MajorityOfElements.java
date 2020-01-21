package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityOfElements implements  test, test1 {

    @Override
    public void myAbstractMethod() {
        System.out.println("Test +++ ");
    }



    public static void main(String args[]) {

        MajorityOfElements moj = new MajorityOfElements();
        moj.myAbstractMethod();
//        Scanner scanner = new Scanner(System.in);
//        int scan = scanner.nextInt();
//
//        for (int j = 1; j <= scan; j++) {
//            int size = scanner.nextInt();
//            int array[] = new int[size];
//            for (int x = 0; x < size; x++) {
//                array[x] = scanner.nextInt();
//            }
//            System.out.println(findOccurence(array));
//        }
//
//    }
//         int data[] = {1, 2, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 1, 0};
           int data[] ={1,2,3};
            System.out.println(findOccurence(data));
        }



    private static int findOccurence(int[] data) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {

                map.put(data[i], map.get(data[i]) + 1);
            } else
                map.put(data[i], 1);

        }

        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            if (map1.getValue() > data.length / 2) {
                return map1.getKey();
            }
        }
        return -1;
    }


}

interface  test{ }
interface  test1{

        abstract void myAbstractMethod();

}



