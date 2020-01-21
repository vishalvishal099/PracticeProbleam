package DailyProgramP.Date02012020;

import java.util.Arrays;

import static DailyProgramP.Date02012020.MinPlatformNeeded.findMinPlatform;

public class MinPlatformNeeded {

    public static int findMinPlatform(int arrival[], int dept[],int n ){
        Arrays.sort(arrival);
        Arrays.sort(dept);
         int maxPlatform=1;
         int minPlatform =1;
          int i =1;
          int j =0;
          while (i<n && j<n){
              if(arrival[i] > dept[j]){
                  j++;
                  maxPlatform--;
              }
              else if(dept[j] > arrival[i]){
                  i++;
                  maxPlatform++;
              }
                  if(maxPlatform > minPlatform){
                      minPlatform =maxPlatform;
                  }
          }


        return minPlatform;
    }

    public static void main(String[] args) {

        int arrival[]={900, 940, 950, 1100, 1500, 1800};
        int dept[] ={910, 1200, 1120, 1130, 1900, 2000};
        int n = arrival.length;
        int minPlatform = findMinPlatform(arrival,dept,n);
        System.out.println(minPlatform);
    }
}
