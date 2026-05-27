package gr.aueb.cf.cf9.ch6;

/**
 * Βρίσκει το ελάχιστο στοιχείο ενός πίνακα.
 */

public class ArrayMin {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
    }

    public static int getMinPosition(int[] arr) {

        if (arr == null || arr.length == 0) return -1;
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {        // σύγκριση
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
