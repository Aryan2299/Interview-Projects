package arrayPackage;

public class FindPairs {

    public static int powerPairs(double[] array1, double[] array2) {
        int power = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                double power1 = Math.pow(array1[i],array2[j]);
                double power2 = Math.pow(array2[j],array1[i]);
                if (power1 > power2) {
                    System.out.println(power1 + " > " + power2);
                    power++;
                }
            }
        }

        return power;
    }
    public static void main(String[] args) {
        double array1[] = {2,1,6};
        double array2[] = {1,5};
        System.out.println(powerPairs(array1,array2));

//        System.out.println(Math.pow(2,3));
    }
}
