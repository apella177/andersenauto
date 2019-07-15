package Interfaces;

public class Dog extends Sobaka {
    @Override
    public int height(int metres) {
        return metres;
    }
    @Override
    public double weight(double kilos) {
        return kilos;
    }

    @Override
    public double move(double kmh) {
        return kmh;
    }

    @Override
    public void eat() {
        String str = "Eat";
        System.out.println(str);

    }
}
