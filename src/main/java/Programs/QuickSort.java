package Programs;


public class QuickSort {
    public static void main(String[] args) {
        int array[] = {2, 7, 3, 6, 1, 8, 9, 4};
        int start = 0, end = 7;
        quicksortA(array,start,end);

    }

    public static void quicksortA(int   []array,int start,int end){
        if(start<end){
        int pindex = partation(array, start, end);
        System.out.println();
        System.out.println("pindex " + pindex);
        quicksortA(array, start, pindex - 1);
        quicksortA(array, pindex+1 , end );
    } }

    public static int partation(int[] array, int start, int end) {
        int pivot = array[end];
        int pindex = start;
        int temp = 0;
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                temp = array[pindex];
                array[pindex] = array[i];
                array[i] = temp;
                pindex++;
            }
        }
        temp = array[pindex];
        array[pindex] = array[end];
        array[end] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        return pindex;
    }


}
