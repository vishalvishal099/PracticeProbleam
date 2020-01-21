package Programs.equalsAndHashcode;

import java.util.HashMap;
import java.util.Map;

public class Exec {
    public static void main(String[] args) {

        Student s = new Student("H123");
        Student s2 = new Student("H123");

        Map<Student, ReportCard> hs = new HashMap<Student, ReportCard>();

        hs.put(s, new ReportCard(10));
        hs.put(s2, new ReportCard(20));

        System.out.println(s.equals(s2));

        System.out.println(hs.size());
        for(Map.Entry<Student, ReportCard> entry :hs.entrySet()){
            System.out.println(entry.getKey().getRegistrationNumber());
            System.out.println(entry.getValue().getMath());

//            if(entry.getValue().getCarNumber().equalsIgnoreCase(registationNumber)){
//                slotNomber = entry.getKey().toString();
            }

            for(Map.Entry<Student, ReportCard> entry : hs.entrySet()) {
                System.out.println(entry.getKey().getRegistrationNumber());
                System.out.println(entry.getValue().getMath());
            }
        }

    }

