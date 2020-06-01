package arrayPackage;

import javax.security.auth.kerberos.KerberosTicket;
import java.util.Arrays;

public class PythagoreanTriplet {

    public static void findTriplets(int array[]) {
        int found = 0;
        double sum = 0;
        double sumInner = 0;
        int index = 0;

//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)Math.pow(array[i], 2);
//        }

        for (int i = 0; i < array.length; i++) {

            if (index == i) {
                continue;
            }
            sum = Math.pow(array[index],2) + Math.pow(array[i],2);

            for (int j = i; j < array.length; j++ ) {

                if (sum == Math.pow(array[j],2)) {

                    System.out.println("Found " + array[index] + " " + array[i] + " " + array[j]);
                    break;
                }
            }
            index++;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int array[] = {2,3,4,6,5};
        findTriplets(array);
    }
}
