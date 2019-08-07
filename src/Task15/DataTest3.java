package Task15;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataTest3 {
    public static void main(String[] args) {
        test();
    }
    static void test() {
        File file = new File("C:\\Users\\Anduser\\Desktop\\ioFile.txt");

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Файла не существует");
        }
    }
}

