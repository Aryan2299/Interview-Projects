package arrayPackage;

import java.rmi.dgc.VMID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class InversionOfArray {

    public static int countSteps(int[] array) {
        int count = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    count++;
                }
            }
        }

        System.out.println("Minimum value is : " + min);
        System.out.println(Arrays.toString(array));
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] array = {2,4,1,3,5};
        countSteps(array);
    }
}
