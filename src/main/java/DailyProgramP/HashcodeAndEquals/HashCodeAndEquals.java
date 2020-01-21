package DailyProgramP.HashcodeAndEquals;

import java.util.HashMap;

public class HashCodeAndEquals {

    public static void main(String[] args) {
        StudentD s1 = new StudentD("H1234");
        StudentD s2 = new StudentD("H1234");
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        String s3 = new String("Vishal");
//        String s4 = new String("Vishal");
//        System.out.println(s1.equals(s2));
//        System.out.println(s3.equals(s4));
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());

        HashMap<StudentD, ReportCard> hashMap = new HashMap<>();
        hashMap.put(s1,new ReportCard());
        hashMap.put(s2, new ReportCard());
        System.out.println(hashMap.size());

    }
}

