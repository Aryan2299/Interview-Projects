package arrayPackage;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class MergeWithNoExtraSpace {

        public void merge(ArrayList<Integer> array1, ArrayList<Integer> array2) {

            ArrayList<Integer> array = new ArrayList<Integer>();


            for (int i = 0; i < array1.size(); i++) {
                array.add(array1.get(i));
                array1.remove(i--);
                System.out.println(array);
            }


            for (int i = 0; i < array2.size();i++) {
                array.add(array2.get(i));
                array2.remove(i--);
                System.out.println(array);
            }

            System.out.println(array);

            int middle = (array.size())/2;
            System.out.println(middle);
            System.out.println(array.get(middle));

            mergeSort(array, 0, array.size());
                System.out.println(array);


        }

        public static void mergeSort(ArrayList<Integer> array, int start, int end) {
            int middle = (start+end)/2;
            ArrayList<Integer> newArray1 = new ArrayList<Integer>();

            for (int i = start; i < middle; i++) {
                newArray1.add(array.get(i));
                System.out.println("1: " + newArray1);
//                mergeSort(newArray1, i+1, middle-1);
                mergeSort(newArray1, middle-1,i);
            }
            for (int i = middle; i < end; i++) {
                newArray1.add(array.get(i));
                System.out.println("2: " + newArray1);
//                mergeSort(newArray1, i, end-1);
                mergeSort(array, i,end-1);
            }


    }

        public static void main (String[] args) {
            //code
            ArrayList<Integer> array1 = new ArrayList<Integer>(){{
                add(1);
                add(3);
                add(5);
                add(7);
//                add(10);
            }};
            ArrayList<Integer> array2 = new ArrayList<Integer>(){{
                add(0);
                add(2);
                add(6);
                add(8);
                add(9);
            }};

            MergeWithNoExtraSpace newInstance = new MergeWithNoExtraSpace();
            newInstance.merge(array1, array2);
        }
}
