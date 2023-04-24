package seminar_01;

import java.util.Scanner;

public class ArrayException {
    public static int[] readArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size array:");
        int size = scanner.nextInt();

        int[] myArray = new int[size];
        System.out.println("Enter members of array:");

        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        return myArray;
    }


    public static int readValue(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter need find value:");
        int value = scanner.nextInt();

        return value;
    }


    public static int readMinSize(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter min size of array:");
        int min = scanner.nextInt();

        return min;
    }


    public static int myArrayExceptions(int[] array, int min, int value) {
        int size = array.length;
        if (array == null){
            return -3;
        }
        if (size < min){
            return -1;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -2;
    }

    public static void parsException(int number){
        String error;
        switch (number) {
            case -1:
                error = "Size of array < min";
                break;
            case -2:
                error = "value not found";
                break;
            case -3:
                error = "Array is null";
                break;
            default:
                error = "Position value" + number;
                break;
        }

        System.out.println(error);

    }

}
