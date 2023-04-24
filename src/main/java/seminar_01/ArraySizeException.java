package seminar_01;

public class ArraySizeException {
    public static int sizeArray(int[] array, int min) {
        int size = array.length;
        if (size < min){
            return -1;
        }
        return size;
    }
}
