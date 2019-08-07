package DraftTask;

import java.io.PrintStream;

public class DraftFormString {
    public static void main(String[] args) {
        System.out.printf("My new car is %s \n", "Audi");
        System.out.printf("%s new car is %s \n", "Hi's", "BMW");
        System.out.printf("%s is power = %d \n", "BMW", 500 );          // d == int; \n == перенос на след.строку


        System.out.printf("BMW is price = %10d \n", 500);               //ширина
        System.out.printf("BMW is price = %10d \n", 5000);
        System.out.printf("BMW is price = %10d \n", 500000000);

        System.out.printf("BMW is price = %-10d \n", 500);              //в обратную сторону
        System.out.printf("BMW is price = %-10d \n", 5000);
        System.out.printf("BMW is price = %-10d \n", 500000000);

        System.out.printf("BMW is price = %.1f \n", 500.12313131);      //округление    f == числа с пл.точкой
        System.out.printf("BMW is price = %.2f \n", 5000.1313131);
        System.out.printf("BMW is price = %.4f \n", 500000000.123131313);
    }
}
