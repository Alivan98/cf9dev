package gr.aueb.cf.cf9.ch6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests για την κλάση {@link SelectionSort}.
 * Ελέγχει την ορθότητα του αλγορίθμου ταξινόμησης με επιλογή.
 */
class SelectionSortTest {

    /**
     * Ελέγχει αν η μέθοδος {@link SelectionSort#selectionSort(int[])} ταξινομεί σωστά
     * έναν τυχαίο πίνακα ακεραίων σε αύξουσα σειρά.
     */
    @Test
    void testSelectionSortStandard() {
        int[] unsorted = {12, 11, 13, 5, 6, 8, 23, 45, 55};
        int[] expected = {5, 6, 8, 11, 12, 13, 23, 45, 55};

        int[] sorted = SelectionSort.selectionSort(unsorted);

        assertArrayEquals(expected, sorted);
    }

    /**
     * Ελέγχει τη συμπεριφορά του αλγορίθμου όταν ο πίνακας περιέχει
     * διπλότυπα/πανομοιότυπα στοιχεία (Edge Case).
     */
    @Test
    void testDuplicateElements() {
        int[] arr = {5, 2, 5, 1, 2};
        int[] expected = {1, 2, 2, 5, 5};

        int[] result = SelectionSort.selectionSort(arr);

        assertArrayEquals(expected, result);
    }


     //Ελέγχει την οριακή περίπτωση (Edge Case) ενός άδειου πίνακα.
    @Test
    void testEmptyArray() {
        int[] empty = {};
        int[] expected = {};

        int[] result = SelectionSort.selectionSort(empty);

        assertArrayEquals(expected, result);
    }
}
