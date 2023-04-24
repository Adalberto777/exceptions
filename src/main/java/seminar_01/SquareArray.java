package seminar_01;

import java.util.Scanner;

public class SquareArray {
    public static int[][] readArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size array length and width:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        int[][] myArray = new int[length][width];
        System.out.println("Enter members of array:");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }

        return myArray;
    }

    public static int sumElementsSquareArray(int[][] myArray){
        if (myArray.length != myArray[0].length){
            throw new RuntimeException("Array must be square");
        }

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i][j] !=0 && myArray[i][j] != 0){
                    throw new RuntimeException("Array element must be 0 or 1");
                }
                sum += myArray[i][j];
            }
        }
        return sum;
    }
}
