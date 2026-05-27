package gr.aueb.cf.cf9.ch3;

/**
 * Εξετάζει αν χιονίχει με βάση την θερμοκρασία και το
 * αν ο καιρός είναι βροχερός.
 */

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it's raining (True/False): ");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert temprature value: ");
        temp = scanner.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
