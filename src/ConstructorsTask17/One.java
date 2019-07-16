package ConstructorsTask17;

public class One {
    public static void main(String[] args) {
        One obj1 = new One();
        obj1.getclass();
        Two obj2 = new Two("Игорь");
        obj2.getclassgetname();
    }
    void getclass() {
        System.out.println(getClass().getName());
    }
}
