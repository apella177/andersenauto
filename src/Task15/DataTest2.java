package Task15;
import java.util.List;

public class DataTest2 {
    public static void main(String[] args) {
        List<String> list = null;
        try {
            list.get(0);
        } catch (NullPointerException e) {
            System.out.println("Нельзя");
        }
    }
}
