package seminar_02;

import java.util.ArrayList;

public class Checker {
    static public ArrayList<String> checker(ArrayList<String> array) {
        ArrayList<String> myArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            int sizeLine = array.get(i).length();
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < sizeLine; j++) {
                if (array.get(i).charAt(j) == '?') {
                    sb.append(sizeLine - 2);
                } else {
                    sb.append(array.get(i).charAt(j));
                }
            }
            myArray.add(sb.toString());
        }
        return myArray;
    }
}
