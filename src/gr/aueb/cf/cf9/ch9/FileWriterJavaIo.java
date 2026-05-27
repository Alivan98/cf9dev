package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file writers in java.io package.
 */

public class FileWriterJavaIo {

    public static void main(String[] args) {
        File file = new File("C:/Users/Aliva/IdeaProjects/Cf9Dev/src/gr/aueb/cf/cf9/ch9/file.txt");

        try { PrintStream ps = new PrintStream("C:/Users/Aliva/IdeaProjects/Cf9Dev/src/gr/aueb/cf/cf9/ch9/file-ps.txt");
            fileWriter(file.getAbsolutePath());
            buffetedWriter(file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε");
        }
    }
    public static void fileWriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Hello World!");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buffetedWriter(String file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8,true))) {
            bw.write("Hello World!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printStream(String file) throws IOException {
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("Hello World!");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }


    public static void printWriter(String file) throws IOException {
        try (PrintWriter ps = new PrintWriter(file)) {
            ps.println("Hello World!");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void sayHello(PrintStream ps) {
        ps.println("Hello Coding!");
    }
}
