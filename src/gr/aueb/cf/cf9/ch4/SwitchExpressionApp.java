package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class SwitchExpressionApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        char classification = 0;

        System.out.println("Please insert a grade number:");
        grade = scanner.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> {
                System.out.println("Αποτυχία");
                yield 'F';
            }
            case 5, 6 -> 'C';
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> {
                System.out.println("Παρακαλώ εισάγετε βαθμό μεταξύ 1 έως 10");
                yield 'U';
            }

        };
        System.out.println("Classification = " + classification);
    }
}

