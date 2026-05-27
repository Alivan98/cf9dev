package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n με μέθοδο.
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int factorial = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Call the service method.
        factorial = facto(num);

        System.out.println("The factorial of " + num + " is " + factorial);
    }


    /**
     *
     * @param n    the number to calculate factorial of
     * @return     the factorial of n.
     */


    public static int facto(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
