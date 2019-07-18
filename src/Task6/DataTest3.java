package Task6;

public class DataTest3 {
    public static void main(String[] args) {
        String[][] array = {{"Яблоки ", "Код товара:1 ", "Цена:60"}, {"Апельсины ", "Код товара:2 ", "Цена:300"}, {"Груши ", "Код товара:3 ", "Цена:100"}};
        data(array, "Код товара:3 ");
        boolmas();
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

}

