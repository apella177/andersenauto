package dataTests;

public class DataTest2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        string(array);
        test(30, 50);
        test1();
    }

    public static void string(int[] array) {
        String str = "";                                      //Типы данных.Задание 9 + 10
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        System.out.println(str);
        String str1 = "123456";
        String str2 = " Hello";
        System.out.println(str.charAt(0) + str2);
        System.out.println(str.charAt(1) + str2);
        System.out.println(str.charAt(2) + str2);
        System.out.println(str.charAt(3) + str2);
        System.out.println(str.charAt(4) + str2);
        System.out.println(str.charAt(5) + str2);
    }

    public static void test(int time, int money) {            //Операторы.Задание 1

        if (time >= 8 && time < 12 && money >= 10) {
            System.out.println("Идем в магазин");
        } else if (time >= 12 && money >= 50) {
            System.out.println("Идем в кафе");
        } else if (time < 19 && money < 50) {
            System.out.println("Идем к соседу");
        } else if (time >= 19 && time < 22) {
            System.out.println("Смотрим телевизор");
        } else if (time >= 22) {
            System.out.println("Идем спать");
        }
    }

    public static void test1() {                            //switch...case - Для себя
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
    }
}