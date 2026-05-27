package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * H {@link BankApp} παρέχει μία μόνο υπηρεσία,
 * την κατάθεση.
 */
public class BankApp {
    static double balance = 0.0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amount = 0.0;

        try {
            System.out.println("Please enter an amount to deposit: ");
            amount = in.nextDouble();
            deposit(1000);
            System.out.println("Το υπόλοιπο μετά την κατάθεση είναι: " + balance);
        } catch (Exception e) {
            System.out.println("Δεν μπορεί να γίνει κατάθεση αρνητικού ποσού");
        }

    }

    /**
     * Deposit an amount of money
     * @param amount       the amount of deposit.
     * @throws Exception   if the amount is negative.
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative");
            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage()); // logging
            throw e; //re-throwing the Exception
        }
    }
}
