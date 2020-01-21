public class PairSum {

    public static void main(String[] args) {

        int arr[] = {8,7,2,5, 3,1};
        int sum = 10;

        findSum(arr, sum);

    }

    private static void findSum(int []arr, int sum) {
        for (int i=0; i<arr.length; i++ ){
            for (int j=i+1 ; j<arr.length; j++){
                if(arr[i] + arr[j]==sum){
                    System.out.println("Found sum at " + i + " and "+ j);
                    return;
                }

            }

        }
        System.out.println("Pair not found ");
    }


}
