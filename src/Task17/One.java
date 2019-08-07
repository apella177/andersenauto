package Task17;

public class One {
    public static void main(String[] args) {
        One obj1 = new One();
        One obj2 = new One("Игорь");
        obj1.getClass();
    }
    public One() {

        System.out.println(getClass().getName());
    }
    public One(String name){

        System.out.println(getClass().getName() + " " + name );
    }

}

