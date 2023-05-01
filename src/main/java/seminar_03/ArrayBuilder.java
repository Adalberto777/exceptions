package seminar_03;

import java.util.Scanner;

public class ArrayBuilder {
    public static String[][] arrayBuilder(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size array length and width:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        String[][] myArray = new String[length][width];
        System.out.println("Enter members of array:");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                myArray[i][j] = scanner.next();
            }
        }

        return myArray;
    }
}
