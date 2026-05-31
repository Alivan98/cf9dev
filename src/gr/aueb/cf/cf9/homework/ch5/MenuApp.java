package gr.aueb.cf.cf9.homework.ch5;

import java.util.Scanner;

/**
 * Δημιουργεί ένα Menu με 6 επιλογές.
 * Αναλόγως την επιλογή εμφανίζει και διαφορετική διάταξη με αστεράκια (*).
 */


public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int n = 0;

        do {
            System.out.println("Μενού Επιλογών");
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια από 1 έως n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια από n έως 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Επίλεξε ένα από τα παραπάνω:");
            choice = scanner.nextInt();

            if (choice == 6) {
                break;
            }

            System.out.println("Εισάγετε έναν αριθμό για αστεράκια:");
            n = scanner.nextInt();

            switch (choice) {
                case 1:
                    printHorizontialStars(n);
                    break;
                case 2:
                    printVerticalStars(n);
                    break;
                case 3:
                    printLinesWithStars(n);
                    break;
                case 4:
                    ;
                    printLines1ToN(n);
                    break;
                case 5:
                    ;
                    printLinesNTo1(n);
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή");

            }
        } while (true);
    }

    public static void printHorizontialStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void printVerticalStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void printLinesWithStars(int n) {
        for (int i = 0; i < n; i++) {
            printHorizontialStars(n);
        }
    }

    public static void printLines1ToN(int n) {
        for (int i = 1; i <= n; i++) {
            printHorizontialStars(i);
        }
    }

    public static void printLinesNTo1(int n){
        for (int i = n; i >=1 ; i--) {
            printHorizontialStars(i);
        }
    }
}