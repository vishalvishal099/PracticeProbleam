//public class FindSubArraySumOfGivenNum {
//
//    public static void main(String[] args) {
//        int arr[] = {12, 5, 31, 9, 21, 8};
//        int acutalSum = 45;
//        int sum = 0;
//        findArray(arr, acutalSum, sum);
//    }
//
//    public static int findArray(int[] arr, int acutalSum, int sum) {
//
//            for (int j = 0; j < arr.length; j++) {
//                sum = sum + arr[j];
//                if (sum == acutalSum) {
//                    System.out.println("Start index " + i + "end index" +j + "Sum = " + sum );
//                    break;
//                }
//            }
//
//        return -1;
//    }
//
//}