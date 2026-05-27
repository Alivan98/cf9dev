package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 2 τιμές, αριθμητή
 * και παρονομαστή και το πρόγραμμα υπολογίζει
 * το πηλίκο, επαναληπτικά.
 *
 * Αν ο αριθμητής είναι μηδέν, το πρόγραμμα διακόπτεται.
 * Αν ο παρονομαστής είναι μηδέν, η διαδικασία επαναλαμβάνεται.
 */

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


        while (true) {
            System.out.println("Please insert a numerator");
            numerator = scanner.nextInt();

            if(numerator==0) {
                System.out.println("Numerator is 0. Quiting...");
                break;
            }

            System.out.println("Please insert a dominator");
            denominator = scanner.nextInt();

            if(denominator==0) {
                System.out.println("Cannot divide by zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);

        }

    }
}
