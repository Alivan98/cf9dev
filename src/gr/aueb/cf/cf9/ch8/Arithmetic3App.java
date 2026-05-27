package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic3App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while(true) {
            System.out.println("Please enter two integers (0 for exti)");
            num1 = in.nextInt();
            if(num1 == 0) break;


            // Validation αντί για try catch
            num2 = in.nextInt();
            if (num2 == 0) {
                System.out.println("Παρονομαστής δεν μπορεί να είναι μηδέν");
                continue;
            }
            result = num1 / num2;
            System.out.println("Result = " + result);
        }
    }
}
