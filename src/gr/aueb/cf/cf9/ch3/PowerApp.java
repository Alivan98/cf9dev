package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, a^n.
 * a^n = a * a * a * ... * a
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;
        int i = 1;

        System.out.println("Παρακαλούμε εισάγετε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %d\n", base , power, result);
    }
}
