package gr.aueb.cf.cf9.ch9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests για την κλάση {@link FileWriterJavaIo}.
 * Δοκιμάζει την ορθότητα της εγγραφής δεδομένων σε αρχεία
 * χρησιμοποιώντας προσωρινούς καταλόγους δοκιμών.
 */
class FileWriterJavaIoTest {

    /**
     * Ο προσωρινός κατάλογος που δημιουργείται αυτόματα από το JUnit 5
     * και καταστρέφεται μετά την εκτέλεση των tests.
     */
    @TempDir
    Path tempDir;

    /**
     * Ελέγχει αν η μέθοδος {@link FileWriterJavaIo#fileWriter(String)}
     * δημιουργεί σωστά το αρχείο και γράφει το περιεχόμενο "Hello World!".
     */
    @Test
    void testFileWriter() throws IOException {
        // Δημιουργούμε μια έγκυρη προσωρινή διαδρομή αρχείου
        Path tempFile = tempDir.resolve("test-fw.txt");
        String filePath = tempFile.toAbsolutePath().toString();

        // Εκτέλεση της μεθόδου σας
        FileWriterJavaIo.fileWriter(filePath);

        // Επαλήθευση: Ελέγχουμε αν το αρχείο υπάρχει όντως
        assertTrue(Files.exists(tempFile), "Το αρχείο πρέπει να έχει δημιουργηθεί");

        // Επαλήθευση: Διαβάζουμε το περιεχόμενο και ελέγχουμε αν γράφτηκε σωστά το κείμενο
        String content = Files.readString(tempFile);
        assertEquals("Hello World!", content, "Το περιεχόμενο του αρχείου δεν είναι το αναμενόμενο");
    }

    /**
     * Ελέγχει αν η μέθοδος {@link FileWriterJavaIo#printStream(String)}
     * γράφει επιτυχώς το κείμενο στο αρχείο.
     */
    @Test
    void testPrintStream() throws IOException {
        Path tempFile = tempDir.resolve("test-ps.txt");
        String filePath = tempFile.toAbsolutePath().toString();

        FileWriterJavaIo.printStream(filePath);

        assertTrue(Files.exists(tempFile));

        // Η printStream χρησιμοποιεί println(), οπότε το κείμενο θα έχει αλλαγή γραμμής στο τέλος
        String content = Files.readString(tempFile);
        assertTrue(content.contains("Hello World!"));
    }
}
