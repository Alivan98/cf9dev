package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Creates a message that contains the name of the user
 * and his age.
 */
public class StrConCat {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        // Είσοδος δεδομένων με scanner, validation και data biding.
        System.out.println("Please enter your firstname: ");
        firstname = in.nextLine();

        System.out.println("Please enter your age: ");
        while(!in.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            in.nextLine();
        }
        age = in.nextInt();

        // Call a service method
        message = createMessage(firstname, age);

        // Εκτύπωση αποτελεσμάτων
        System.out.println(message);
    }


    /**
     * Create a message that contains the name of the user and the age
     * @param firtsname the user's first name.
     * @param age       the user's age.
     * @return          the message.
     */


    public static String createMessage(String firtsname, int age) {
        return String.format("Hello, my name is %s and I am %d years old");
    }
}
