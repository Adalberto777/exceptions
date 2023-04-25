package seminar_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList myArray = Checker.checker(Reader.reader());
        Writer.writer(myArray);
    }
}



