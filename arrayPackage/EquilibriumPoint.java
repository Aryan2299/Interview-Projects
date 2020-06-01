package arrayPackage;

import java.util.Arrays;

public class EquilibriumPoint {

    public static int findingEquilibtiumPoint(int[] array) {

        int sumi = 0;
        int sumj = 0;
        int sumnew = 0;
        int found = 0;
        int foundIndex = 0;

//        for (int i = 0; i < array.length; i++) {
//            sumi = sumi + array[i];
//            for (int j = (i); j < array.length; j++) {
//                sumj = sumj + array[j];
//
//                if (sumi == sumj) {
//                    found = array[i];
//                    foundIndex = i;
//                    break;
//                }
//            }
//            sumj = 0;
//        }

        for (int i = 0; i < array.length; i++) {
            sumi = sumi + array[i];
        }

        System.out.println(sumi);

        for (int i = 0; i < array.length; i++) {
            sumj = sumi - array[i];
            sumnew = sumnew + array[i];
            if (sumj == sumnew) {
                System.out.println("found " + array[i-1]);
                break;
            }
        }

//        System.out.println("Equilibrium point is: " + found + " at index: " + foundIndex);

        return found;
    }

    public static void main(String[] args) {
        int array[] = {1,3,5,2,2};
        int array2[] = {9,1,1,5,1,1,1,0};
        findingEquilibtiumPoint(array);
        findingEquilibtiumPoint(array2);
    }
}
