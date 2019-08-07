package Task9;

public class DataTest1 {                                                 //Классы и объекты. Задание 1,2

    public static void main(String[] args) {
        DataTest1 obj1 = new DataTest1();
        System.out.println(obj1.name("HI", "1"));
        DataTest1 obj2 = new DataTest1();
        System.out.println(obj2.name("HI", "2"));
    }

    public String name(String a, String b) {
        return getClass().getName() + " " + a + " " + b;
    }

}
