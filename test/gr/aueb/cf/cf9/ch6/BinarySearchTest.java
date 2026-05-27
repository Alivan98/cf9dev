package gr.aueb.cf.cf9.ch6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests για την αναδρομική κλάση {@link BinarySearch}.
 * Ελέγχει την ορθότητα του αλγορίθμου δυαδικής αναζήτησης.
 */

class BinarySearchTest {


    //Ελέγχει την περίπτωση όπου το στοιχείο υπάρχει μέσα στον πίνακα.
    //Πρέπει να επιστρέφει το σωστό index.
    @Test
    void testElementExists() {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        // Το 23 βρίσκεται στο index 5. Ξεκινάμε την αναζήτηση από το 0 έως το 9 (sortedArray.length - 1).
        int result = BinarySearch.binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        assertEquals(5, result);
    }

    //Ελέγχει την περίπτωση όπου το στοιχείο δεν υπάρχει στον πίνακα.
    //Πρέπει να επιστρέφει -1.
    @Test
    void testElementDoesNotExist() {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 50;

        int result = BinarySearch.binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        assertEquals(-1, result);
    }


     // Ελέγχει αν η μέθοδος διαχειρίζεται σωστά έναν πίνακα που είναι null (Edge Case).
    @Test
    void testNullArrayReturnsMinusOne() {
        int target = 10;
        int result = BinarySearch.binarySearch(null, target, 0, 5);
        assertEquals(-1, result);
    }

    //Ελέγχει τις οριακές περιπτώσεις (Edge Cases) αναζήτησης στα άκρα του πίνακα.
    @Test
    void testFirstAndLastElement() {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int highIndex = sortedArray.length - 1;

        // Έλεγχος για το πρώτο στοιχείο (index 0)
        assertEquals(0, BinarySearch.binarySearch(sortedArray, 2, 0, highIndex));

        // Έλεγχος για το τελευταίο στοιχείο (index 9)
        assertEquals(9, BinarySearch.binarySearch(sortedArray, 91, 0, highIndex));
    }
}