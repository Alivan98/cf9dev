package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει εάν πρέπει να ανάψουν τα φώτα
 * ενός αυτοκινήτου με βάσει τρεις μεταβλητές:
 * αν βρέχει ΚΑΙ ταυτόχρονα ισχύει ένα τουλάχιστον
 * από τα επόμενα: είναι σκοτάδι Ή τρέχουμε (speed > 100).
 * Τις τιμές αυτές τις λαμβάνουμε από τον χρήση (stdin).
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        final int speedLimit = 100;

        System.out.println("Please insert if it's raining (True/False): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it's dark (True/False): ");
        isDark = in.nextBoolean();

        System.out.println("Please insert your speed value: ");
        speed = in.nextInt();

        lightsOn = isRaining && (isDark || (speed >= speedLimit));

        System.out.println("Your lights are on: " + lightsOn);




    }
}
