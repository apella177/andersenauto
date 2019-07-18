package Task10.DataDraft;

public class Dog1 extends Sobaka1 {
    int metres;
    double kilos;
    double kmh;
    public Dog1(int metres, double kilos, double kmh) {
        this.metres = metres;
        this.kilos = kilos;
        this.kmh = kmh;
    }
    double pounds;
    int gramms;
    int ms;
    public Dog1(double pounds, int gramms, int ms) {
        this.pounds = pounds;
        this.gramms = gramms;
        this.ms = ms;
    }
    @Override
    public int height(int metres) {return metres;}
    public double height(double pounds) {return pounds;}
    @Override
    public double weight(double kilos) {return kilos;}
    public int weight(int gramms) {return gramms;}
    @Override
    public double move(double kmh) {return kmh;}
    public int move(int ms) {return ms;}
    @Override
    public void eat() {
        String str = "Eat";
        System.out.println(str);
    }
}
