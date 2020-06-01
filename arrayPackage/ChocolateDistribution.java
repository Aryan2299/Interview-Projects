package arrayPackage;

import java.util.Arrays;

public class ChocolateDistribution {

    public static void minDistribution(int[] array, int m, int start) {

        int min = array[start];
        int minIndex = 0;

        for (int i = start; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                minIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[start];
        array[start] = temp;

        System.out.println(Arrays.toString(array));
    }

    public static int repeat(int[] array, int m, int start) {

        int lastIndex = m;

        while(m > 0) {
            minDistribution(array, m, start++);
            m--;
        }

        int difference = array[lastIndex-1] - array[0];

        return difference;
    }

    public static void main(String[] args) {
        int array[] = {3,4,1,9,56,7,9,12};
        System.out.println("\nMinimum diiference is: " + repeat(array, 4,0));
    }
}