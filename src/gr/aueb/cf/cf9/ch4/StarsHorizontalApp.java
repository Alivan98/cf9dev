package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει 10 οριζόντια αστεράκα με for.
 */
public class StarsHorizontalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } System.out.println();
        }

        for(int i = 10; i >=1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
