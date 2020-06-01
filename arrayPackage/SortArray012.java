package arrayPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray012 {

    public static int[] sortArray(int[] array) {
        int item0 = 0;
        int item2 = array.length-1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[item0] + array[i];
                array[item0] = array[item0] - array[i];
                array[i] = array[item0] + array[i];
                item0++;
            }
        }

        for (int i = (array.length-1); i >= 0; i--) {
            if (array[i] == 2) {
                int temp = array[item2];
                array[item2] = array[i];
                array[i] = temp;
                item2--;
            }
        }

        System.out.println(Arrays.toString(array));
        return array;

    }
    public static void main(String[] args) {
        int array[] = {1,0,2,1,2,0,6};
        sortArray(array);
    }
}
