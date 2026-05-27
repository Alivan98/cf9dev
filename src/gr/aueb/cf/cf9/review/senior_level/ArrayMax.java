package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Calculate the maximum value of an array.
 */

public class ArrayMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        // Data entry, validation, data biding
        System.out.println("Please enter five integers: ");
        for (int i = 0; i < numbers.length; i++) {

            // Validate input
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                in.nextLine();
            }
            numbers[i] = in.nextInt();
        }

        // Delegation - καλεί υπηρεσίες / μεθόδους
        maxPosition = findMaxPosition(numbers);
        maxValue = numbers[maxPosition];

        // Results Output
        System.out.printf("The maximum value is %d at position %d.", maxValue, (maxPosition + 1));
    }

    /**
     * Finds the position of the maximum value of an array.
     * @param arr   the input array.
     * @return      the position of the maximum value.
     */
    public static int findMaxPosition(int[] arr) {
        if(arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return  maxPosition;
    }
}
