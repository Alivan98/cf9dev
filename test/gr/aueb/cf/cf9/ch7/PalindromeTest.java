package gr.aueb.cf.cf9.ch7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests για την κλάση {@link Palindrome}.
 * Ελέγχει την ορθότητα των μεθόδων ελέγχου παλίνδρομων συμβολοσειρών.
 */
class PalindromeTest {

    /**
     * Ελέγχει την πρώτη μέθοδο {@link Palindrome#isPalindrome(String)}
     * με έγκυρα και άκυρα παλίνδρομα (Case-Sensitive).
     */
    @Test
    void testStandardPalindrome() {
        assertTrue(Palindrome.isPalindrome("radar"));
        assertTrue(Palindrome.isPalindrome("level"));
        assertFalse(Palindrome.isPalindrome("hello"));

        // Οριακές περιπτώσεις
        assertTrue(Palindrome.isPalindrome(""));
        assertTrue(Palindrome.isPalindrome("a"));
    }

    /**
     * Ελέγχει τη δεύτερη μέθοδο {@link Palindrome#isPalindrome2(String)}
     * η οποία χρησιμοποιεί {@link StringBuilder} και αγνοεί πεζά/κεφαλαία (Case-Insensitive).
     */
    @Test
    void testStringBuilderPalindromeWithCaseInsensitivity() {
        // Ελέγχουμε αν πιάνει σωστά παλίνδρομα με κεφαλαία/πεζά (π.χ. Radar)
        assertTrue(Palindrome.isPalindrome2("Radar"));
        assertTrue(Palindrome.isPalindrome2("AnNa"));
        assertFalse(Palindrome.isPalindrome2("Java"));

        // Οριακές περιπτώσεις
        assertTrue(Palindrome.isPalindrome2(""));
    }
}
