package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true / false από το stdio
 * για τις δύο δεξαμενές αν είναι < 1/4
 * Επεξεργάζεται και ανάβει πορτοκαλί αν η
 * μία είναι < 1/4 και κόκκινο αν και οι
 * δύο είναι 1<4
 */

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean orangeLight = false;
        boolean redLight = false;
        double tank1Volume = 0.0;
        double tank2Volume = 0.0;
        final double tankLimit = 0.25;

        System.out.println("Please insert Tank's 1 Volume value: ");
        tank1Volume = in.nextDouble();

        System.out.println("Please insert Tank's 2 Volume value: ");
        tank2Volume = in.nextDouble();

        isEmptyTank1 = tank1Volume <= tankLimit;
        isEmptyTank2 = tank2Volume <= tankLimit;
        orangeLight = isEmptyTank1 ^ isEmptyTank2;
        redLight = isEmptyTank1 && isEmptyTank2;


        System.out.println("Tank's 1 volume is lower than 1/4: " + isEmptyTank1);
        System.out.println("Tank's 2 volume is lower than 1/4: " + isEmptyTank2);
        System.out.println("Orange Light is on: " + orangeLight);
        System.out.println("Red Light is on: " + redLight);
    }
}
