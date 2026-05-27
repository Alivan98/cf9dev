package gr.aueb.cf.cf9.ch7;

/**
 * Δήλωση και αρχικοποίηση (populate) ενός
 * {@link String}
 */


public class Strinit {
    public static void main(String[] args) {
        String s1 = "Athens";                      // popular
        String s2 = new String("Athens"); // not popular


        System.out.println(s1);
        System.out.println("Length: " + s1.length());
        System.out.printf("City: %s\n", s1);

    }
}
