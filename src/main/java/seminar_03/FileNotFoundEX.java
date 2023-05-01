package seminar_03;

import java.io.FileNotFoundException;

public class FileNotFoundEX extends FileNotFoundException {
    public FileNotFoundEX(){
        super("File not found");
    }
}
