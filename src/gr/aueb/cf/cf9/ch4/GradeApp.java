package gr.aueb.cf.cf9.ch4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Δίνει ο χρήστης έναν βαθμό και επιστρέφει
 * έναν χαρακτηρισμό
 */

public class GradeApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please insert a grade number:");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Κάτω από την βάση!");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς!");
                break;
            case 7:
            case 8:
                System.out.println("Λείαν Καλώς!");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα!");
                break;
            default:
                System.out.println("Ο Βαθμός πρέπει να είναι μεταξύ 1 έως 10");
                break;
        }
    }
}
