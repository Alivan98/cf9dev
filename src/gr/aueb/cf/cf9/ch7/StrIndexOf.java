package gr.aueb.cf.cf9.ch7;

/**
 *
 */

public class StrIndexOf {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); // 1
        int positionOfNexto = cf.indexOf("o", 2); // 11
        System.out.println(positionOfNexto);

        int posistionOfNexto = cf.indexOf("o", 2); // 11
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o"); // 11
        System.out.println(positionOfLasto);
    }

    // Μέθοδος που να επιστρέφει την κατάληξη του ονόματος αρχείου
    public static String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf("." + 1));
    }
}
