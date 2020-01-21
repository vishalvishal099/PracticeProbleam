package Programs;
public class Continue {

    public static void main(String[] args) {

      //  int a =10, b=5;
     //   int i1 = 10 ? 1 : 8; int can't converted to boolean

        int a =1;
        int b =2;
        int c;
        int d ;
        c = ++b;
        d = a++;
        c++;
        b++;
        ++a;
        System.out.println(a +"    "+ b +"           "+c+  " c       ");

      // int sum&difference;

        for (int i=0; i< 100; i++){
            if(i==33){
                System.out.println(i);
                continue;
                // System.out.println(i);
            }
        }
    }
}
