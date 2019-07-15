package dataTests;

public class Auto {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setName("BMW");
        car1.setHp(500);
        car1.setYear(2019);
        car1.setCountry("Germany");
        car1.inf();

        Cars car2 = new Cars();
        car2.setName("Audi");
        car2.setHp(400);
        car2.setYear(2018);
        car2.setCountry("Germany");
        car2.inf();

        Cars car3 = new Cars();
        car3.setName("VW");
        car3.setHp(300);
        car3.setYear(2017);
        car3.setCountry("Germany");
        car3.inf();
    }
}