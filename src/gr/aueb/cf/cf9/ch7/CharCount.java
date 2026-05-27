package gr.aueb.cf.cf9.ch7;

/**
 *  Μετράει τους χαρακτήρες ενός String.
 */

public class CharCount {

    public static void main(String[] args) {

    }

    public static int countChar(String str) {
        if (str == null) return 0;
        return str.length();
    }


}
