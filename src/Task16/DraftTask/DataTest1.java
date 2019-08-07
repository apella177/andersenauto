package Task16.DraftTask;

import java.util.ArrayList;
import java.util.List;

public class DataTest1 {
    public static void main(String[] args) {
        ///////////////////  Java 5  ////////////////////////
        ArrayList animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("pig");

        String x = (String) animals.get(1);
        System.out.println(x);

        ///////////////////  Generic  ////////////////////////
        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("pig");

        String y = animals2.get(0);
        System.out.println(y);

        ///////////////////////////////////////////////////////

        DataTest2<String> obj1 = new DataTest2<>();
        obj1.setParam("one");
        obj1.setParam("two");
        obj1.setParam("three");

        String z = obj1.getParam();
        System.out.println(z);

    }
}

