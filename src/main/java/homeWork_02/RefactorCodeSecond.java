package homeWork_02;


public class RefactorCodeSecond {
    /**
     *  task 3 method
     */
    public static void refactorCodeSecond(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!" + ex);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!" + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!" + ex);
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..." + ex);
        }
    }
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);

/*        if (a != null && b != null) {

          } else {
              System.out.println("Один или оба аргумента равны null!");
*/        }
    }





