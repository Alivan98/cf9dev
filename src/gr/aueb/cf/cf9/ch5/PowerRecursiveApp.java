package gr.aueb.cf.cf9.ch5;

/**
 *
 */

public class PowerRecursiveApp {
    public static void main(String[] args) {
    int result = 0;
    result = powerRecursive(2,5);
        System.out.printf("The result of 2^5 = %d", result);
    }

    public static int powerRecursive(int base, int power) {


        return power <= 0 ? 1 : base * powerRecursive(base,power-1);
    }
}


