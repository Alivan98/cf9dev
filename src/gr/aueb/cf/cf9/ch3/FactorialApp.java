package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates factorial of a number
 * For instance, 5! = 1 * 2 * 3 * 4 * 5 = 120
 */

public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ εισάγετε το παραγοντικό:");
        number = scanner.nextInt();

        while (i <= number) {
            result *= i;
            i++;
        }

        System.out.printf("%d! = %d\n", number , result);
    }
}
