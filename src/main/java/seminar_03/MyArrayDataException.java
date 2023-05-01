package seminar_03;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j){
        super("I can't pars string to int element with index: " + i + " " +j);
    }
}
