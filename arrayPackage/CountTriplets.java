package arrayPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class CountTriplets extends InputArray {
    public void implementClass() {
        Scanner testCases = new Scanner(System.in);
//        Scanner arrayLength = new Scanner(System.in);
//        Scanner sumValue = new Scanner(System.in);

        System.out.println("Enter number of test cases: ");
        Integer T = testCases.nextInt();
        System.out.println("Number of test cases: " + T);

        try {
//            ArrayList<Integer> array = new ArrayList<Integer>();

            for (int k = 0; k < T; k++) {
                ArrayList<Integer> array = new ArrayList<Integer>(super.inputAnArray());

                int sum, anotherSum;
                for (int i = 1; i < array.size(); i++) {
                    sum = array.get(0) + array.get(i);
                    if (i == array.size()-1) {
                        anotherSum = array.get(i) + array.get(0);
                    } else {
                        anotherSum = array.get(i) + array.get(i+1);
                    }

                    for (int j = 0; j < array.size(); j++) {
                        if (sum == array.get(j)) {
                            System.out.println("Sum " + sum + " found " + " at 1 " + " and " + (i+1));
                        } else if (anotherSum == array.get(j)) {
                            if (i == array.size()-1) {
                                System.out.println("Another sum " + anotherSum + " found " + " at 0 " + " and " + (i+2));
                            } else {
                                System.out.println("Another sum " + anotherSum + " found " + " at " + (i+1) + " and " + (i+2));
                            }
                            // System.out.println("Another sum" + anotherSum + " found " + " at " + (i+1) + " and " + (i+2));
                        }
                    }
                }



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
        CountTriplets newClass = new CountTriplets();
        newClass.implementClass();
    }
    }

