package arrayPackage;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;

/* Java program for Merge Sort */
class mergeSort
{
    public static void merge(int arr[], int l, int m, int r) {
        int size1 =  m - l + 1;
        int size2 = r - m;

        int array1[] = new int[size1];
        int array2[] = new int[size2];

        for (int i = 0; i < size1; i++) {
            array1[i] = arr[l + i];
        }
        for (int i = 0; i < size2; i++) {
            array2[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                arr[k] = array1[i];
                i++;
            } else {
                arr[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i<size1) {
            arr[k] = array1[i];
            i++;
            k++;
        }
        while (j<size2) {
            arr[k] = array2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        sort(arr, 0, arr.length-1);
        
    }
}

