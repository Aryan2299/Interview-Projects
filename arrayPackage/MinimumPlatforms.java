package arrayPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumPlatforms {
    public static int trainSchedule(int[] arrival, int[] departure) {
        int platforms = 1;
        int max = arrival[0];

        for (int i = 0; i < arrival.length; i++) {
            for (int j = i; j < arrival.length; j++) {
                if (departure[i] < departure[j] && departure[i] > arrival[j]) {
                    platforms++;
                    max = departure[i];
                    System.out.println("Max: " + max);
                    break;
                }
            }

//            if (departure[i] > arrival[i+1]) {
//                platforms++;
//                max = departure[i];
//                System.out.println("Max: " + max);
//            }

//            for (int j = 0; j < departure.length; j++) {
//                if (j == i) {
//                     continue;
//                }
//                if (arrival[i] > departure[j] && platforms > 1) {
//                    platforms--;
//                    break;
//                }
//            }

        }

        System.out.println(platforms);
        return platforms;
    }

    public static void main(String[] args) {
        int arrival[] = {900,915,940, 950, 1100, 1500, 1800};
        int departure[] = {910, 920,1200, 1120, 1130, 1900, 2000};
        trainSchedule(arrival, departure);

        int arrival1[] = {900,1100,1235};
        int departure1[] = {1000,1200,1240};
        trainSchedule(arrival1, departure1);

        int arrival2[] = {900,910,930,1005};
        int departure2[] = {1000,1100,1240,1030};
        trainSchedule(arrival2, departure2);
    }
}
