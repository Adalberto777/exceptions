package homeWork_02;

import java.util.Scanner;

public class RefactorCode {
    /**
     *  task 2 method
     */
    public static void refactorCode(){
        Integer[] intArray = new Integer[] {6, null, 2, 0, -1, 7, 3, 10, 5};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }






//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a integer value: ");
//
//        int d = scanner.nextInt();
//
//        if (d == 0){
//            throw new RuntimeException("division by zero is not supported, try agan");
//        }
//        if (intArray.length < 9){
//            throw new RuntimeException("length of array don't have the eighth index ");
//        }
//        else {
//            double catchedRes1 = intArray[1] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        }
    }
}
