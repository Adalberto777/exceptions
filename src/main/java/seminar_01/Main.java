package seminar_01;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Integer[] myArray = new Integer[7];
        myArray[0] = 1;
        int min = 1;
        int value = 6;
//        System.out.println(ArraySizeException.sizeArray(array, min));

//        ArrayException.parsException(ArrayException.myArrayExceptions(ArrayException.readArray(), ArrayException.readMinSize(), ArrayException.readValue()));

//        System.out.println(SquareArray.sumElementsSquareArray(SquareArray.readArray()));

        CheckArray.checkArray(myArray);
    }
}
