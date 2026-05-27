package gr.aueb.cf.cf9.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int num = 0;

//        try {
//            num = in.nextInt();
//            System.out.println("Num: " + num);
//        }   catch (InputMismatchException e) {
//            System.err.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if(in != null) {
//                    in.close();
//                }
//            } catch (Exception e) {
//                System.err.println("Error: " + e.getMessage());
//                e.printStackTrace();
//            }
//        }

        try(Scanner in = new Scanner(System.in)) {      // try with resources
            num = in.nextInt();
            System.out.println("num: " + num);
        } catch (InputMismatchException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
