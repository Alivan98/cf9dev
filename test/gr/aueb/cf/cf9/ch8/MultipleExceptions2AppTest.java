package gr.aueb.cf.cf9.ch8;

import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests για την κλάση {@link MultipleExceptions2App}.
 * Ελέγχει αν οι μέθοδοι διαχείρισης εξαιρέσεων πετούν τα σωστά σφάλματα
 * ανάλογα με τα δεδομένα εισόδου.
 *
 * @author Alivan
 * @version 1.0
 */
class MultipleExceptions2AppTest {

    /**
     * Ελέγχει αν η μέθοδος πετάει {@link FileNotFoundException}
     * όταν της δίνουμε ένα αρχείο που δεν υπάρχει στον υπολογιστή.
     */
    @Test
    void testFileNotFoundThrowsException() {
        assertThrows(FileNotFoundException.class, () -> {
            MultipleExceptions2App.readFileAndChar("non_existent_file.txt");
        }, "Αν το αρχείο δεν υπάρχει, πρέπει να πετάει FileNotFoundException");
    }

    /**
     * Ελέγχει αν η μέθοδος πετάει {@link IllegalArgumentException} (Edge Case)
     * όταν το όνομα του αρχείου είναι null ή κενό κείμενο.
     */
    @Test
    void testNullFilenameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MultipleExceptions2App.readFileAndChar(null);
        }, "Αν το όνομα αρχείου είναι null, πρέπει να πετάει IllegalArgumentException");
    }
}
