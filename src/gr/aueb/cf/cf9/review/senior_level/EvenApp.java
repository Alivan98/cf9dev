package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class EvenApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        // Είσοδος Δεδομένων. Validation και Data Biding.
        System.out.println("Please enter a number");
        while (!in.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            in.nextLine();
        }
        num = in.nextInt();

        // Business Logic - Παραστάσεις
        result = isEven(num);

        // Results Output
        System.out.println("The number is eve: " + result);
    }

    /**
     * Checks if a number is even.
     * @param num   the number to check.
     * @return      true if tje number is even, false otherwise.
     */

    public static boolean isEven (int num) {
        return num % 2 == 0;

    }
}
