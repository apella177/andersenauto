public class Test {
    public static void main(String[] args) {
        Auto car1 = new Auto();
        car1.name = "BMW X3";
        car1.price = 40000;
        car1.cur = "S";
        car1.information();

        Auto car2 = new Auto();
        car2.name = "Audi Q5";
        car2.price = 38000;
        car2.cur = "E";
        car2.information();
    }
}

class Auto {
    int price;
    String name;
    String cur;

    void information() {
        System.out.println(name + " = " + price + cur);
    }
}

