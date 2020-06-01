package arrayPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class SubarrayWithGivenSum {

    private void increment(int S, int N, ArrayList<Integer> array) {
        int sum;
        for (int j = 0; j < N; j++) {
            sum = array.get(j);
            for (int i = j + 1; i < N - 1; i++) {
                if (sum == S) {
                    System.out.println("Sum found in: " + array.subList(i, j));
                    break;
//                    break;
                }
                if (sum > S || i == N) {
                    System.out.println("No");
                    break;
                } else {
                    sum = sum + array.get(i);
                }
            }
        }
    }

    private void array1() {
        Scanner testCases = new Scanner(System.in);
        Scanner arrayLength = new Scanner(System.in);
        Scanner sumValue = new Scanner(System.in);

        System.out.println("Enter number of test cases: ");
        Integer T = testCases.nextInt();
        System.out.println("Number of test cases: " + T);

        try {

            ArrayList<Integer> array = new ArrayList<Integer>();

            for (int i = 0; i < T; i++) {

                System.out.println("Enter length of array");
                Integer N = arrayLength.nextInt();
                System.out.println("Length of array is: " + N);

                System.out.println("Enter sum to be found");
                Integer S = sumValue.nextInt();
                System.out.println("Sum to be found is: " + S);

                System.out.println("Enter elements");

                for (int j = 0; j < N; j++) {
                    Scanner newElement = new Scanner(System.in);
                    Integer mainArray = newElement.nextInt();
                    array.add(mainArray);
                }

                increment(S, N, array);
                System.out.println(array);

            }
        } catch (Exception e) {
            if (T < 1 || T > 100) {
                System.out.println("Number of test cases is not valid");
            }
//            else if (N < 1 || N > 100) {
//                System.out.println("Array length is not valid");
//            }
            else {
                System.out.println("Something went wrong.");
            }
        }
    }


    public static void main(String[] args) {
//        arrayPackage.SubarrayWithGivenSum implementClass = new arrayPackage.SubarrayWithGivenSum();
//        implementClass.array1();

        int[] array = {1, 2, 3, 7, 5};
        int N = array.length;
        int S = 12;
        int sum;
        for (int j = 0; j < N; j++) {
            sum = array[j];

            for (int i = j + 1; i <= N; i++) {
                if (sum == S) {
                    int p = i-1;
                    System.out.println("Sum found at: " + j + "and" + p);
                }
                if (sum > S || i == N) {
//                    sum = array[i];
                    break;
                } else {
                    sum = sum + array[i];
                }
                System.out.println(sum);
            }
        }
    }
}
