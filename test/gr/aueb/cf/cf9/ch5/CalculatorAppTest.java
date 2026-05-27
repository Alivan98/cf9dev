package gr.aueb.cf.cf9.ch5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorAppTest {

    @Test
    void testAdd() {
        // Ελέγχουμε τη δική σας μέθοδο add
        assertEquals(10, CalculatorApp.add(7, 3));
        assertEquals(-2, CalculatorApp.add(-5, 3));
    }

    @Test
    void testSub() {
        assertEquals(4, CalculatorApp.sub(7, 3));
    }

    @Test
    void testDivByZeroReturnsZero() {
        // Ελέγχουμε αν η div επιστρέφει 0 όταν ο num2 είναι 0, όπως τον έχετε προγραμματίσει!
        assertEquals(0, CalculatorApp.div(10, 0));
    }

    @Test
    void testModByZeroReturnsZero() {
        // Ελέγχουμε το edge case της mod με μηδέν
        assertEquals(0, CalculatorApp.mod(10, 0));
    }

    @Test
    void testIsChoiceValid() {
        // Ελέγχουμε αν το validation σας δουλεύει σωστά για έγκυρες και άκυρες επιλογές
        assertTrue(CalculatorApp.isChoiceValid(1));  // Το 1 πρέπει να είναι έγκυρο
        assertTrue(CalculatorApp.isChoiceValid(6));  // Το 6 πρέπει να είναι έγκυρο
        assertFalse(CalculatorApp.isChoiceValid(0)); // Το 0 πρέπει να είναι άκυρο
        assertFalse(CalculatorApp.isChoiceValid(7)); // Το 7 πρέπει να είναι άκυρο
    }
}
