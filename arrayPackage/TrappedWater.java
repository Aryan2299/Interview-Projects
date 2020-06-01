package arrayPackage;

public class TrappedWater {

    public static int TrapWater(int[] array) {
        int max = 0;
        int max_index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }

        max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[max_index]) {
                continue;
            }
            if(array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);

        System.out.println("Trapped water is " + calculateTrappedWater(array, max) + " units");

        return max;
    }

    public static int calculateTrappedWater(int[] array, int largestWall) {
        int trappedWater = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < largestWall) {
                trappedWater = trappedWater + (largestWall - array[i]);
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int array[] = {3,0,0,2,0,4};
        TrapWater(array);
    }
}

