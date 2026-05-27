package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Δίνουμε αρχική τιμή, τελική τιμή και βήμα αύξησης
 * και υπολογίζει το πλήθος των επαναλήψεων.
 */

public class GenericWhileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int endVal = 10;

        while (i <= endVal) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Επαναλήψεις / Loops / Iterations: " + (i -1));
    }
}