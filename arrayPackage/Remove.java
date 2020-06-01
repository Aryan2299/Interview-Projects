package arrayPackage;

import java.util.Arrays;

public class Remove {
    public static int[] remove(int[] array) {

        int newArray[] = new int[array.length-1];

        int j = 1;

        for (int i = 0; i < array.length; i++) {
            if (i == (array.length-1)) {
                break;
            }
            newArray[i] = array[i+1];
        }

        return newArray;
    }

    public static int[] remove(int[] array, int index) {

        int newArray[] = new int[array.length-1];

        for (int i = 0; i < array.length; i++) {
            if (i == (array.length-1)) {
                break;
            }
            if (i < index) {
                newArray[i] = array[i];
            }
            if (i>=index) {
                newArray[i] = array[i+1];
            }
        }

        return newArray;
    }

    public static void main(String[] args, int[] array) {
        remove(array);
    }
}
