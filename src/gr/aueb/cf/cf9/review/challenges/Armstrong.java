package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Ένας αριθμός Armstrong είναι ένας
 * αριθμός ίσος με το άθροισμα των
 * ψηφίων του και το κάθε ψηφίο έχει
 * υψωθεί στην δύναμη του αριθμού των
 * ψηφίων.
 *
 * Π.χ 153 = 1^3 + 5^3 + 3^3
 */

public class Armstrong{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int initialNum = 0;
        int numberOfDigits = 0;
        int digit = 0;
        int sum = 0;

        System.out.println("Please enter a number: ");
        num = in.nextInt();

        numberOfDigits = String.valueOf(num).length();
        while (num != 0); {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        System.out.printf("%d%s Armstrong\n", initialNum, (sum == initialNum) ? "is" : " is not");
    }
}
