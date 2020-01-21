package javaLearning.String;

public class IntegerPalidrom {
    public static void main(String[] args) {
        int data = 454;
        int temp = data;
        int reminder = 0;
        int reverse = 0;
        while (temp != 0) {
            reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp = temp / 10;
        }
        System.out.println(reverse + "");
        if(data ==reverse){
            System.out.println("Pelidrom");
        }else System.out.println("Not pelidrom");
    }

}
