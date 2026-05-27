package gr.aueb.cf.cf9.review.junior_level;

/**
 * Οι μεταβλητές α, m δεν είναι 'καλά' ονόματα.
 * Ο κώδικας θα μπορούσε να είναι σε μέθοδο.
 * Δεν υπάρχει έλεγχος για κενό array.
 * Δεν έχει documentation, δομή, SoC.
 */

public class ArrayMax {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 91, 63, 23, 87, 13};
        int m = a[0];

        for(int i = 1; i <= a.length; i++) {
            if(a[i] > m) {
                m = a[i];
            }
            System.out.println(m);

        }
    }

}
