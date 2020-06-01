package arrayPackage;

import java.util.Arrays;

public class rearrangeArray {

    public static int[] rearrangewithExtra(int[] array) {

        int newArray[] = new int[array.length];
        int middle = array.length/2;
        int j = 0;
        for (int i = 0; i < middle; i++) {
            newArray[j] = array[i];
            j++;
        }

        for (int i = middle; i < array.length; i++) {
            newArray[j] = array[i];
            j++;
        }

        System.out.println(Arrays.toString(newArray));
        return newArray;
    }


    public static int[] rearrange(int[] array) {

        for (int i = 0; i <= array.length; i++) {
            if (i == array.length-1) {
                break;
            }
            if (i%2==0) {
                shift(array, i, array.length-1);
            }
        }

        System.out.println(Arrays.toString(array));

        return array;
    }

    public static int[] shift(int[] array, int i, int j) {
        int start = i;
        for (i = i; i < array.length; i++) {
            if (i == array.length-1) {
                break;
            }
            int last = array[j];

            for (j = j; j > i; j--) {
                array[j] = array[j-1];
            }
            array[start] = last;
        }

        return array;
    }

    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6};
        int array2[] = {10,20,30,40,50,60,70,80,90,100,110};
        rearrange(array1);
        rearrange(array2);
//        rearrangewithExtra(array1);
//        rearrangewithExtra(array2);
    }
}
