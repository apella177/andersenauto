package DraftTask;

public class DraftString {
    public static void main(java.lang.String[] args) {
        String str1 = "name1";
        String str2 = "name1";
        String str3 = str1 + " and " + str2;
        System.out.println(str1.toUpperCase());

        System.out.println(str3.length());
        System.out.println(str1.charAt(1));
        if (str1.equals(str2)) {
            System.out.println("равно");
        } else {
            System.out.println("не равно");}

        String [] array = {"один","два","три"};
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]" + " " + array[i]);
        }
    }
}
