package gr.aueb.cf.cf9.ch7;

/**
 * Traverses a string one-by-one character be character.
 * Όχι με enchanced for loop, αλλά με την κλασσική for.
 */

public class StrTraverse {
    public static void main(String[] args) {
        String str = "Coding";
        for (int i = 0 ;i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " );
        }

        // print the reversed string

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i) + " " );
        }
    }
}
