package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τα base και power
 * και το πρόγραμμα υπολογίζει το base^power
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int base = 0;
        int power = 1;
        int result = 1;

        System.out.println("Please insert a number for base");
        System.out.println("Please insert a number for power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for(int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("The result is " + result );
    }
}
