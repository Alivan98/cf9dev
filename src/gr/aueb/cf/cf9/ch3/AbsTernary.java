package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 *  Υπολογίζει το απόλυτο ενός ακεραίου με την χρήση
 *  του τριαδικού τελεστή.
 */


public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num = 5;
        int abs = 0;

        // Είσοδος Δεδομένων
        System.out.println("Please enter a number: ");
        num = scanner.nextInt(); //Data binding

        // Επεξεργασία Δεδομένων
//        if (num < 0) {
//            abs = - num;
//        } else {
//            abs = num;
//        }

        abs = (num >= 0) ? num : -num;
        System.out.printf("The abs of %d is %d", num, abs);
    }
}
