package gr.aueb.cf.cf9.homework.ch3;

import java.util.Scanner;

/**
 * Ελέγχει εάν ένα έτος είναι
 * δίσεκτο ή όχι.
 */

public class BinaryYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;

        System.out.println("Εισάγετε αριθμό έτους:");
        year = scanner.nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Το έτος " + year + " είναι δίσεκτο");
            } else {
                System.out.println("Το έτος " + year + " ΔΕΝ είναι δίσεκτο");
        }
    }
}
