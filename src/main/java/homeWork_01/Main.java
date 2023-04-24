package homeWork_01;

public class Main {
    public static void main(String[] args) {
        Integer[] firstArray = new Integer[] {6, 2, null, 0, -1, 7};
        Integer[] secondArray = new Integer[] {1, 2, 3, 10, -1, 0};

        ArraysOperations.printArray(ArraysOperations.subtractionArray(firstArray, secondArray));

//        ArraysOperations.printArray(ArraysOperations.divisionArray(firstArray, secondArray));

    }
}
