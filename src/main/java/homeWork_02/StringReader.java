package homeWork_02;

import java.util.Scanner;

public class StringReader {
    /**
     *  method that asks the user to enter a string
     */
    public static void stringReader(){

        Scanner scanner = new Scanner(System.in);
        String str = "";

        do{
            System.out.print("Enter a string: ");
            str = scanner.nextLine();

            if(str.isEmpty()){
                System.out.println("Try again. you must enter a string, the string must not be empty ");
            }else {
                System.out.println("You enter: " + str);
            }
        }while (str.isEmpty());
        scanner.close();
    }
}
