package arrayPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArray {
    public static ArrayList<Integer> inputAnArray() {

        ArrayList<Integer> finalArray= new ArrayList<Integer>();

        try {
        Scanner arrayLength = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println("Enter length of array");
        Integer N = arrayLength.nextInt();
        System.out.println("Length of array is: " + N);

        System.out.println("Enter elements");

        for (int j = 0; j < N; j++) {
            Scanner newElement = new Scanner(System.in);
            Integer mainArray = newElement.nextInt();
            array.add(mainArray);
        }

        System.out.println("Array is " + array);

        finalArray = array;

        } catch (Exception e) {
            System.out.println("Something went wrong while inputting array." + e);
        }

        return finalArray;
    }
}
