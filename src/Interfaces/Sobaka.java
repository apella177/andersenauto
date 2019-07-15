package Interfaces;

public class Sobaka implements Animals {
    public static void main(String[] args) {
        Sobaka sobaka1 = new Sobaka();
        System.out.println(sobaka1.height(1));
        System.out.println(sobaka1.weight(41.4));
        System.out.println(sobaka1.move(20.5));
        sobaka1.eat();
        System.out.println(sobaka1.height(0.5));
        System.out.println(sobaka1.weight(40400));
        System.out.println(sobaka1.move(90));
    }
    @Override
    public int height(int metres) {
        return metres;
    }
    public double height(double pounds) {
        return pounds;
    }
    @Override
    public double weight(double kilos) {
        return kilos;
    }
    public int weight(int gramms) {
        return gramms;
    }
    @Override
    public double move(double kmh) {
        return kmh;
    }
    public int move(int ms) {
        return ms;
    }

    @Override
    public void eat() {
        String str = "Eat";
        System.out.println(str);
    }
}
