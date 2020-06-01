package arrayPackage;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class OrderOfSmallestElement {

    public static int order(int[] array, int l, int r) {
        int min = array[l];
        int min_index = 0;

        for(int i = l; i < r; i++) {
            if (array[i] <= min) {
                min = array[i];
                min_index = i;
            }
        }


        int temp = array[l];
        array[l] = array[min_index];
        array[min_index] = temp;

//
//        System.out.println(min);
//        System.out.println(Arrays.toString(array));
        return min;
    }

    public static void kthSmallest(int[] array, int l, int r, int k) {
        int repeat = k, minElement;

        while(k > 0) {
            minElement = order(array, l, r);
            if (k == 1) {
                System.out.println("K'th (" + repeat + ") " + "smallest element is " + minElement);
            }
            l++;
            k--;
        }
    }

    public static void main(String[] args) {
        int array[] = {2,49,76,45,78,39,367,53,289020,2920,389};
        kthSmallest(array, 0, array.length, 3);
    }
}
