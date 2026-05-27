package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class NewSwitchApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please insert a grade number:");
        grade = scanner.nextInt();

        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Κάτω από την βάση!");
            case 5, 6 -> System.out.println("Καλώς!");
            case 7, 8 -> System.out.println("Λείαν Καλώς!");
            case 9, 10 -> System.out.println("Άριστα!");
            default -> System.out.println("Ο Βαθμός πρέπει να είναι μεταξύ 1 έως 10");
        }
    }

}
