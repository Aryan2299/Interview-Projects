package arrayPackage;

import java.lang.reflect.Array;

public class LeadersInArray {

    public static int findLeaders(int[] array) {
        int leader = array[array.length-1];
        int max = array[array.length-1];

        System.out.println("Leader: " + leader);

        for (int i = (array.length-1); i >= 0; i--) {
            if (i == 0) {
                if (array[i] >= max) {
                    leader = array[i];
                    System.out.println("Leader: " + leader);
                }
                break;
            }
            if (array[i-1] > array[i]) {
                max = array[i-1];
            }
            if (array[i] >= max) {
                leader = array[i];
                System.out.println("Leader: " + leader);
            }
        }

        System.out.println(max);

        return leader;
    }
    public static void main(String[] args) {
        int array1[] = {16, 17, 4, 3, 5, 2};
        findLeaders(array1);
        int array2[] = {1,2,3,4,0};
        findLeaders(array2);
        int array3[] = {7,4,5,7,3};
        findLeaders(array3);
    }
}
