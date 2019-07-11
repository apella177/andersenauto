package dataTests;

public class DataTest3 {
    public static void main(String[] args) {
        String[][] array = {{"Яблоки ", "Код товара:1 ", "Цена:60"}, {"Апельсины ", "Код товара:2 ", "Цена:300"}, {"Груши ", "Код товара:3 ", "Цена:100"}};
        data(array, "Код товара:3 ");
        boolmas();
        cycle1();
        cycle2();
        random1();
        random2();
    }

    public static void data(String[][] array, String code) {         //Типы данных.Задание 4
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] == code) {
                System.out.println();
                System.out.print(array[i][0]);
                System.out.println(array[i][2]);
            }
        }
    }

    public static void boolmas() {                                  //Типы данных.Задание 11
        int[] array1 = {343, 1, 567, 34};
        boolean[] array2 = new boolean[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i] > 100;
        }
        for (boolean x : array2) {
            System.out.println(x);
        }
    }

    public static void cycle1() {                                    //Циклы. Задание 2 While
        int a = 15;
        while (a >= 10) {
            System.out.println(a);
            a--;
        }
    }

    public static void cycle2() {                                   ////Циклы. Задание 2 do....while
        int a = 15;
        do {
            System.out.println(a);
            a--;
        }
        while (a >= 10);
    }

    public static void random1() {                                   ////Циклы. Задание 3
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

