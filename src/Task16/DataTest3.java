package Task16;

public class DataTest3 {                                                   //Задание 2.Generic
    public static void main(String[] args) {
        DataTest4 <String, Integer> person1 = new DataTest4<>();
        person1.setName("Igor");
        person1.setAge(26);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Generic.generateValueByType("");
    }
}
