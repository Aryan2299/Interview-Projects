package arrayPackage;

import java.beans.PropertyEditorManager;
import java.util.Arrays;

public class AddItem {

    public static int[] addItem(int[] array, int item) {

        int newArray[] = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = item;
        return newArray;
    }

    public static int[] addItem(int[] array, int item, int index) {

        int newArray[] = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            }
            if (i >= index) {
                newArray[i+1] = array[i];
            }
            if (i == index) {
                newArray[i] = item;
            }
        }
        return newArray;
    }

    public static void main(String[] args, int[] array, int item) {
        addItem(array, item);
    }
}
