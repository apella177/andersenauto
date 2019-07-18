package Task6;

public class DataTest2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        string(array);
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

}
