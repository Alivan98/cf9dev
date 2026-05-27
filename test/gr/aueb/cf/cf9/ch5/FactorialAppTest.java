package gr.aueb.cf.cf9.ch5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit tests για την κλάση {@link FactorialApp}.
 * Ελέγχει την ορθότητα της μεθόδου υπολογισμού παραγοντικού
 * για κανονικές τιμές καθώς και για ειδικές οριακές περιπτώσεις (edge cases).
 *
 */

class FactorialAppTest {

    @Test
    void testStandardFactorial() {
        // Κανονικές περιπτώσεις: 3! = 6 και 5! = 120
        assertEquals(6, FactorialApp.facto(3));
        assertEquals(120, FactorialApp.facto(5));
    }

    @Test
    void testFactorialOfZero() {
        // SOS Edge Case για τη συνέντευξη: Το παραγοντικό του 0 είναι 1
        assertEquals(1, FactorialApp.facto(0));
    }

    @Test
    void testFactorialOfOne() {
        // Άλλο ένα βασικό όριο: 1! = 1
        assertEquals(1, FactorialApp.facto(1));
    }
}