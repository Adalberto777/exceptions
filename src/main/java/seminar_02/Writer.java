package seminar_02;

import java.io.*;
import java.util.ArrayList;

public class Writer {
    public static void writer(ArrayList<String> array){
        try (BufferedWriter br = new BufferedWriter(new FileWriter("D:\\GeekBrains\\exceptions\\src\\main\\java\\seminar_02\\result.txt")))
        {
            String line;
            for (String i: array
                 ) {
                br.write(i + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
