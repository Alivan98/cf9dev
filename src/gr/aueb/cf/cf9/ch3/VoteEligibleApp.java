package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας άνθρωπος έχει δικαίωμα ψήφου
 * βάσει της ηλικίας του
 */
public class VoteEligibleApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isEligible = false;
        int age = 0;
        final int eligibleAge = 18;

        System.out.println("Plase insert your age: ");
        age = in.nextInt();

        isEligible = age >= eligibleAge;

        System.out.println("Your are eligible: " + isEligible);


    }
}
