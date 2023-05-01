package seminar_03;

public class CheckArrayBuilder {
    public static int checkArrayBuilder(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException();
        }else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    }catch (NumberFormatException e){
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        return sum;
    }
}
