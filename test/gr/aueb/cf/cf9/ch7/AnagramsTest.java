package gr.aueb.cf.cf9.ch7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests για την κλάση {@link Anagrams}.
 * Ελέγχει αν δύο συμβολοσειρές (Strings) αναγνωρίζονται σωστά ως αναγραμματισμοί.
 *
 * @author Alivan
 * @version 1.0
 */
class AnagramsTest {

    /**
     * Ελέγχει αν η μέθοδος αναγνωρίζει σωστά δύο έγκυρους αναγραμματισμούς.
     */
    @Test
    void testValidAnagrams() {
        // Υποθέτουμε μια static μέθοδο isAnagram(String s1, String s2) που επιστρέφει boolean
        assertTrue(Anagrams.isAnagram("listen", "silent"));
        assertTrue(Anagrams.isAnagram("triangle", "integral"));
    }

    /**
     * Ελέγχει την περίπτωση όπου δύο λέξεις ΔΕΝ είναι αναγραμματισμοί.
     */
    @Test
    void testInvalidAnagrams() {
        assertFalse(Anagrams.isAnagram("hello", "world"));
        assertFalse(Anagrams.isAnagram("java", "javascript"));
    }

    /**
     * Ελέγχει οριακές περιπτώσεις (Edge Cases) όπως άδεια Strings.
     * Δύο άδεια Strings θεωρούνται τεχνικά αναγραμματισμοί μεταξύ τους.
     */
    @Test
    void testEmptyStrings() {
        assertTrue(Anagrams.isAnagram("", ""));
    }
}
