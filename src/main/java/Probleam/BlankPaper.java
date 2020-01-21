package Probleam;

import java.util.*;

class BlankPaper {

    /* if x is present in arr[] then returns the index of
    FIRST occurrence of x in arr[0..n-1], otherwise
    returns -1 */
         public static int first(int arr[], int low, int high, int x, int n)
         {
             if(high >= low)
             {
                 int mid = low + (high - low)/2;
                 if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                     return mid;
                 else if(x > arr[mid])
                     return first(arr, (mid + 1), high, x, n);
                 else
                     return first(arr, low, (mid -1), x, n);
             }
             return -1;
         }

    /* if x is present in arr[] then returns the index of
    LAST occurrence of x in arr[0..n-1], otherwise
    returns -1 */
         public static int last(int arr[], int low, int high, int x, int n)
         {
             if (high >= low)
             {
                 int mid = low + (high - low)/2;
                 if (( mid == n-1 || x < arr[mid+1]) && arr[mid] == x)
                     return mid;
                 else if (x < arr[mid])
                     return last(arr, low, (mid -1), x, n);
                 else
                     return last(arr, (mid + 1), high, x, n);
             }
             return -1;
         }

         public static void main (String[] args) {

             int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
             int n = arr.length;
             System.out.println(n+"Vihla ");
             int x = 8;
             System.out.println("First Occurrence = " + first(arr, 0, n - 1, x, n));
             System.out.println("Last Occurrence = " + last(arr, 0, n - 1, x, n));
//
//             String[] array = {"a", "b", "c", "d", "e","a", "b", "c", "d", "e"};
//             String[] array2 = {"a", "b", "c", "d", "e","a", "b", "c", "d", "e"};
//
//
//             Integer [] inter = {1,2,3,4,5,1,2,3,45,5};
//
//             ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(inter));
//             System.out.println( "arraylist wala "+ arrayList);
//
//             HashSet<Integer> hs = new HashSet<Integer>(arrayList);
//             System.out.println(hs);
//
//
//             List<String> al = Arrays.asList(array);
//             System.out.println(al);
//
//             List<String> al2 = Arrays.asList(array2);
//
//            HashSet<String> set = new HashSet<>(al);
//             for(String s : set){
//                 System.out.println(s);
//             }
//             HashSet<String> set2 = new HashSet<>(al2);
//             for(String s1 : set2){
//                 System.out.println(s1);
//             }
//
//             System.out.println(set.equals(set2));
//
//
//             String s = "Welcometojava";
//             int k =3;
//
//             SortedSet<String> sortedSet = new TreeSet<>();
//
//             for(int i=0; i<= s.length() -k; i++){
//                 System.out.println(s.substring(i, i+k));
//              sortedSet.add(s.substring(i, i+k));
//
//             }
//


         }
     }
