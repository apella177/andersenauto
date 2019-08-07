package Task8;

import org.junit.Test;

public class DataTest1 {                                             //Задание 1 в Task6
    public static void main(String[] args) {
        cycle1();
        cycle2();
        random1();
        random2();
    }
    public static void cycle1() {                                    //Циклы. Задание 2 While
        int a = 15;
        while (a >= 10) {
            System.out.println(a);
            a--;
        }
    }

    public static void cycle2() {                                   //Циклы. Задание 2 do....while
        int a = 15;
        do {
            System.out.println(a);
            a--;
        }
        while (a >= 10);
    }

    public static void random1() {                                   //Циклы. Задание 3
        int[] array = {1, 545, 6, 1, 6, 5, 7, 456, 2, 2};
        for (int x : array) {
            if (x == 5) {
                System.out.println(x);
            }
        }
    }

    public static void random2() {                                   ////Циклы. Задание 3
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10));
        }
        for (int x : array) {
            if (x == 5) {
                System.out.println(x + " - Искомое значение");
            }
        }
    }
}
