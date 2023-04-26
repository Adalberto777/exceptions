package homeWork_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatReader {
    /**
     *  method that asks the user to enter a floating point value
     */
    public static void floatReader(){

        Scanner scanner = new Scanner(System.in);
        float value = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print("Enter a floating point value: ");
                value = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Try again. you must enter a floating point value");
                scanner.nextLine();
            }
        } while (!validInput);
        scanner.close();

        System.out.println("You enter: " + value);
    }
}
