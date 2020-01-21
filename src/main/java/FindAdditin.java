public class FindAdditin {

    public int getAdditionCount(String s) {
        int getCount = 0;
        char[] characterSet = s.toCharArray();
        for (char ch : characterSet) {
            char character = ch;
            //Get the ascii value of character
            int charValue = (int) ch;
            int getTheVaule = charValue - 97;
             getCount += fib(getTheVaule);
        }
        return getCount;
    }
    public static int fib(int n){
          if(n <= 1)
              return n ;
          else
              return  fib(n-1) + fib( n-2);
        }
}

