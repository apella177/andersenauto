public class Test2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        string(array);
        test(30, 50);
        test1();
    }

    public static void string(int[] array) {
        String str = "";                                      //преобразование числового массива в строковый и обратно
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        System.out.println(str);
        String str1 = "123456";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
    }

    public static void test(int time, int money) {           //ветвление

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

    public static void test1() {                         //switch...case
        int day =6;
        String days = "";
        switch (day) {
            case 1: days = "Понедельник";
                break;
            case 2: days = "Вторник";
                break;
            case 3: days = "Среда";
                break;
            case 4: days = "Четверг";
                break;
            case 5: days = "Пятница";
                break;
            case 6: days = "Суббота";
                break;
            case 7: days = "Воскресенье";
                break;
        }
        System.out.println(days);
    }
}
