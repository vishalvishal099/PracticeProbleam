package DailyProgramP.Date1912;

public class StringToInt {
    public static void main(String[] args) {
        String s = "10";
        int integerValue =10;
        //String to integer
        int i =Integer.valueOf(s);
       int data =  Integer.parseInt(s);
       //Integer to string
        String StringData = String.valueOf(integerValue);
        StringData = Integer.toString(integerValue);
        System.out.println(data);
        System.out.println(StringData);
    }
}
