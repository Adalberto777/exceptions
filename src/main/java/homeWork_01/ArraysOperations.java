package homeWork_01;

public class ArraysOperations {
    public static Integer[] subtractionArray(Integer[] firstArray, Integer[] secondArray){

        if (firstArray.length != secondArray.length){
            throw new RuntimeException("Arrays have different lengths");
        }

        Integer[] newArray = new Integer[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == null){
                throw new RuntimeException("firstArray[i] is null");
            }
            if (secondArray[i] == null){
                throw new RuntimeException("secondArray[i] is null");
            }
            newArray[i] = firstArray[i] - secondArray[i];
        }
        return newArray;
    }

    public static double[] divisionArray(Integer[] firstArray, Integer[] secondArray){

        if (firstArray.length != secondArray.length){
            throw new RuntimeException("Arrays have different lengths");
        }

        double[] newArray = new double[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == null){
                throw new RuntimeException("firstArray[i] is null");
            }
            if (secondArray[i] == null){
                throw new RuntimeException("secondArray[i] is null");
            }
            if (secondArray[i] == 0){
                throw new RuntimeException("division by zero");
            }

            newArray[i] = firstArray[i] / secondArray[i];
        }
        return newArray;
    }

    public static void printArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
