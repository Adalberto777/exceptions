package seminar_01;

public class CheckArray {
    public static void checkArray(Integer[] myArray) {
        String index = "";
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null){
                index = index + " " + i;

            }
        }
        if (index != ""){
            throw new RuntimeException("Index is null: " + index);
        }else System.out.println("verification successful");
    }
}
