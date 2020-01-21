package javaLearning.String;

public class PalidromSring {
    public static void main(String[] args) {
        String s = "tet";
        char []a = s.toCharArray();
        String reverse ="";
        char c ;
/** Frist method
        for (int i = a.length-1; i >=0; i--){
              c = a[i];
            reverse = reverse + String.valueOf(c);

        }  */

//second method

        for (int i = s.length() -1 ; i>=0; i--){
             //reverse= reverse + s.charAt(i);
            reverse += s.charAt(i);
        }

        if(s.equals(reverse)){
            System.out.println("Pelidrom");
        }else System.out.println("Not");
    }
}
