package seminar_03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, MyArraySizeException, MyArrayDataException {
/*        try {
            DoSomething.doSomething();
        }catch (RuntimeException e){
          System.out.println("Caught an IOException: " + e.getMessage());
        }

        Count.add();
        Count.add();
        Count.add();
        Integer n = Count.getCount();
        System.out.println(n);

        try {
            throw new ByZero();
        }catch (ByZero e){
            System.out.println(e);
        }
*/

        System.out.println(CheckArrayBuilder.checkArrayBuilder(ArrayBuilder.arrayBuilder()));
    }
}
