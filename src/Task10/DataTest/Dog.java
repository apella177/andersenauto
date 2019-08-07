package Task10.DataTest;

public class Dog extends Sobaka {
    double height;
    double weight;
    double move;

    public Dog(double height, double weight, double move) {
        this.height = height;
        this.weight = weight;
        this.move = move;
    }
    @Override
    public int height() { return (int) height;}
    public double height(String str) {
        if (str.equals("metres")) {
            return height;
        } else if (str.equals("pounds")) {
            return height * 0.453592;
        } else { return 0.0; }
    }
    @Override
    public double weight() {return (int) weight;}
    public double weight(String str1) {
        if (str1.equals("kg")) {
            return weight;
        } else if (str1.equals("grams")) {
            return weight * 1000;
        } else { return 0.0; }
    }
    @Override
    public double move() {return (int) move;}
    public double move(String str3) {
        if (str3.equals("kmh")) {
            return move;
        } else if (str3.equals("ms")) {
            return move * 3.6;
        } else { return 0.0; }
    }
    @Override
    public void eat() {
        String str = "Eat";
        System.out.println(str);
    }
}
