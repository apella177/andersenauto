package Task10.DataTest;

public class Sobaka implements Animals {
    public static void main(String[] args) {
        Dog dog1 = new Dog(1.0, 40,44.4);
        System.out.println(dog1.height("pounds"));
        System.out.println(dog1.weight("grams"));
        System.out.println(dog1.move("ms"));

    }
    @Override
    public int height() {
        return 1;
    }
    @Override
    public double weight() {
        return 20.5;
    }
    @Override
    public double move() {
        return 20;
    }
    @Override
    public void eat() {
        String str = "Eat";
        System.out.println(str);
    }
}
