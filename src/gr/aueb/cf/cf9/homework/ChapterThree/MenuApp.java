package gr.aueb.cf.cf9.homework.ChapterThree;

import java.util.Scanner;

/**
 * Δημιουργεί ένα Μενού ο οποίο επαναλαμβάνεται
 * μέχρι ο χρήστης ναδώσει τον αριθμό 5.
 */

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0 ;

        do {
            System.out.println("Μενού Επιλογών");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Επίλεξε ένα από τα παραπάνω:");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Παρακαλώ επιλέξτε τις επιλογές από 1 έως 5");
                continue;
            }
            if (choice == 5) {
                System.out.println("Έξοδος από το Μενού...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Επιλέξατε Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιλέξατε Διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση");
                    break;
            }

        } while (true);
    }
}
