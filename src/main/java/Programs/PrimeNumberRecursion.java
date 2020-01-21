package Programs;

public class PrimeNumberRecursion {
    public static void main(String[] args) {
        boolean result = primeNumber(1);
        System.out.println(result);

    }

    public static boolean primeNumber(int num) {

        int runner = num / 2;

        if (num == 2)
            return false;
        else if (num > 1) {

            for (int i = 2; i <= runner; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

            return true;
    }
}



