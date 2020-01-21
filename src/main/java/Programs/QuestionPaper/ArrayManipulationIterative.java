package Programs.QuestionPaper;

public class ArrayManipulationIterative {

    //Interative method
    public int[] arrayManipulation(int array[], int a, int b, int k) {

        for (int j = a - 1; j < b; j++) {
            array[j] = array[j] + k;
        }
        return array;
    }

    public static void main(String args[]) {
        ArrayManipulationIterative ar = new ArrayManipulationIterative();
        int array[] = {0, 0, 0, 0, 0};
        int arrayUpdated[] = ar.arrayManipulation(array, 1, 2, 100);
        arrayUpdated = ar.arrayManipulation(arrayUpdated, 2, 5, 100);
        arrayUpdated = ar.arrayManipulation(arrayUpdated, 3, 4, 100);

        int max = 0;
        for (int x = 0; x < arrayUpdated.length; x++) {
            System.out.print(arrayUpdated[x] + "  ");
        }
        for (int x = 0; x < arrayUpdated.length - 1; x++) {
            if (arrayUpdated[x] >= arrayUpdated[x + 1]) {
                max = arrayUpdated[x];
            } else
                max = arrayUpdated[x + 1];
        }

        System.out.println();
        System.out.println("The maximum element =  " + max);
    }

}
