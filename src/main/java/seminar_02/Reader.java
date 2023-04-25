package seminar_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
    public static ArrayList<String> reader(){
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\GeekBrains\\exceptions\\src\\main\\java\\seminar_02\\sours.txt")))
        {
            String line;
            ArrayList<String> myArray = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                myArray.add(line);
            }
            return myArray;
        } catch (IOException  e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
