package Task15;

public class DataTest1 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
            int[] array = {1};
            array[3] = 10;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
               System.out.println("Исключение типа " + e);
           }
        }
    }






//checked exception (compile time exception) == исключительные случаи в работе программы,
// могут возникать в ходе работы программы

//unchecked exception (runtime exception) == ошибка в работе программы), не нужно обрабатовать,
// данные ошибки нужно устранять

