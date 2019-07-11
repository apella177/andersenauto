package dataTests;

public class Test {                                                 //Классы и объекты. Задание 1,2
    public static void main(String[] args) {
        Test obj1 = new Test();
        System.out.println(obj1.name("HI", "1"));
        Test obj2 = new Test();
        System.out.println(obj2.name("HI", "2"));
    }

    String name(String x, String y) {
        return getClass().getName() + " " + x + " " + y;
    }
}
