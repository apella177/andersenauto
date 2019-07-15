package dataTests;

public class Test {                                                 //Классы и объекты. Задание 1,2
    public static void main(String[] args) {
        Test obj1 = new Test();
        String a = obj1.name("HI", "1");
        System.out.println(a);
        Test obj2 = new Test();
        String b = obj2.name("HI", "2");
        System.out.println(b);
    }

    public String name(String a, String b) {
        return getClass().getName() + " " + a + " " + b;
    }
}
