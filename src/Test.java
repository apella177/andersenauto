public class Test {
    public static void main(String[] args) {
        Auto car1 = new Auto();
        car1.power = 150;
        car1.name = "Toyota Rav4";
        System.out.println(car1.name + ": " + car1.power + " PH");

        Auto car2 = new Auto();
        car2.power = 245;
        car2.name = "BMW X3";
        System.out.println(car2.name + ": " + car2.power + " PH");
    }
}

class Auto {
        int power;
        String name;
    }
