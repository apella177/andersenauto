package Task14.HashMap;

import java.util.HashMap;
import java.util.Map;

public class DataTask1 {
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.setAuthor("Tolstoy");
        book1.setName("Repca");

        Books book2 = new Books();
        book2.setAuthor("Gogol");
        book2.setName("Viy");

        Map<String, Books> library = new HashMap<>();
        library.put(book1.getName(),book1);
        library.put(book2.getName(),book2);

        Books tolstoy = library.get(book1.getName());
        System.out.print(tolstoy.getAuthor() + " - ");
        System.out.println(tolstoy.getName());

        Books gogol  = library.get(book2.getName());
        System.out.print(gogol.getAuthor() + " - ");
        System.out.println(gogol.getName());
    }
}
