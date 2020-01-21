package DailyProgramP.Date1912;

public class ReverserSentance {
    public static void main(String[] args) {
        String s= "Java Concept Of The Day";
        String [] input = s.split(" ");
        for (int i=input.length-1; i >= 0 ; i--){
            System.out.print(input[i] + "  ");
        }
    }
}
