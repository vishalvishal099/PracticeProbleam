package Programs;

import java.util.HashSet;

class PairSum
{
    static void printpairs(int arr[],int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];

            // checking for condition
            if (temp>=0 && s.contains(temp))
            {
                System.out.println("Pair with given sum " +
                        sum + " is (" + arr[i] +
                        ", "+temp+")");
            }
            s.add(arr[i]);
        }
    }

    // Main to test the above function
    public static void main (String[] args)
    {
        //int A[] = {1, 4, 45, 6, 10, 8};
        int A[] = {1, 2, 4, 6, 7, 8,9,11,12,13,15};
        int n = 7;
        printpairs(A,  n);
    }
}