package arrayPackage;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] array, int pairsOf) {

        for (int i = 0; i < array.length; i+=pairsOf) {
            if (i + pairsOf > array.length) {
                pairsOf = (array.length-i);
                for (int j = 0; j < pairsOf/2; j++) {
                    int temp = array[i+j];
                    array[i+j] = array[i - j + (pairsOf-1)];
                    array[i - j + (pairsOf-1)] = temp;
                }
                break;
            }

            for (int j = 0; j < pairsOf/2; j++) {
                int temp = array[i+j];
                array[i+j] = array[i - j + (pairsOf-1)];
                array[i - j + (pairsOf-1)] = temp;
            }
        }

        System.out.println(Arrays.toString(array));

        return array;
    }

    public static void main(String[] args) {
        int array[] = {5,76,75,9,64,75678,755,89,78,7};
        reverseArray(array, 4);
    }
}
