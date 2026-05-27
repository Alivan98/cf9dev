package gr.aueb.cf.cf9.ch6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests για την κλάση {@link BubbleSort}.
 * Ελέγχει την ορθότητα του αλγορίθμου ταξινόμησης φυσαλίδας.
 *
 * @author Alivan
 * @version 1.0
 */
class BubbleSortTest {

    /**
     * Ελέγχει αν η μέθοδος {@link BubbleSort#bubbleSort(int[])} ταξινομεί σωστά
     * έναν ανακατεμένο πίνακα ακεραίων σε αύξουσα σειρά.
     */
    @Test
    void testBubbleSortStandard() {
        int[] unsorted = {12, 11, 13, 5, 6, 8, 23, 45, 55};
        int[] expected = {5, 6, 8, 11, 12, 13, 23, 45, 55};

        // Αποθηκεύουμε το αποτέλεσμα που επιστρέφει η μέθοδός σας
        int[] sorted = BubbleSort.bubbleSort(unsorted);

        // Έλεγχος αν ο επιστρεφόμενος πίνακας είναι σωστά ταξινομημένος
        assertArrayEquals(expected, sorted);
    }

    /**
     * Ελέγχει τη συμπεριφορά του αλγορίθμου όταν ο πίνακας είναι ήδη ταξινομημένος.
     */
    @Test
    void testAlreadySorted() {
        int[] sorted = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        int[] result = BubbleSort.bubbleSort(sorted);

        assertArrayEquals(expected, result);
    }

    /**
     * Ελέγχει την οριακή περίπτωση (Edge Case) ενός άδειου πίνακα.
     */
    @Test
    void testEmptyArray() {
        int[] empty = {};
        int[] expected = {};

        int[] result = BubbleSort.bubbleSort(empty);

        assertArrayEquals(expected, result);
    }
}
