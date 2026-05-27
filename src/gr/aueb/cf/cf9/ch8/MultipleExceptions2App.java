package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptions2App {

    public static void main(String[] args) {
        try {
            // Καλούμε τη μέθοδο με ένα αρχείο που μάλλον δεν υπάρχει
            readFileAndChar("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Char read error");
        }
    }

    /**
     * Ανοίγει ένα αρχείο και διαβάζει έναν χαρακτήρα.
     * Απομονωμένη μέθοδος για να είναι 100% Testable.
     *
     * @param filename Το όνομα του αρχείου προς ανάγνωση
     * @throws FileNotFoundException Αν το αρχείο δεν βρεθεί
     * @throws IOException Αν υπάρξει σφάλμα στην ανάγνωση
     */
    public static void readFileAndChar(String filename) throws FileNotFoundException, IOException {
        if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("Filename cannot be null or empty");
        }

        File file = new File(filename);
        try (Scanner scanner = new Scanner(file)) {
            // Διαβάζει από το αρχείο αντί για το System.in για να είναι ελέγξιμο
            if (scanner.hasNext()) {
                scanner.next();
            }
        }
    }
}
