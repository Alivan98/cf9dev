package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων
 * ενός ακεραίου. Για παράδειγμα, αν ο ακέραιος
 * είναι 178, το πλήθος των ψηφίων είναι 3.
 */

public class DigitsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 178;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();
        inputNum = num; //saves the input num for later use.

        while (num > 0) {
            num = num / 10;
            digits++;
        }

        System.out.println("The number of digits of " + inputNum + " is :" + digits);
    }
}
