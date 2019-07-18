package Task10.DataDraft;                                  //перегрузка с конструктором

public class Sobaka1 implements Animals1 {
    public static void main(String[] args) {
        Dog1 obj1 = new Dog1(0.5,40000,10);
//      System.out.println(obj1.metres);
//      System.out.println(obj1.kilos );
//      System.out.println(obj1.kmh);

        System.out.println(obj1.pounds);
        System.out.println(obj1.gramms);
        System.out.println(obj1.ms);
        obj1.eat();
    }
    @Override
    public int height(int metres) {
        return 0;
    }
    @Override
    public double weight(double kilos) {
        return 0;
    }
    @Override
    public double move(double kmh) {
        return 0;
    }
    @Override
    public void eat() {
        String str = "Eat";
        System.out.println(str);

    }
}
