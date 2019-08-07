package Task14.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class  ListTask {
    public static void main(String[] args) {
        List collection = new ArrayList();
        //List collection = new LinkedList();
        collection.add(1);
        collection.add("Опана");
        collection.add(3);
        collection.add(4);
        collection.set(0,500);                              //меняем значение индекса:0 с 1 на 500

        System.out.println(collection.get(0));              //выбор элемента по индексу
        for (Object o : collection) System.out.println(o);  //через foreach
        for (int i = 0; i < collection.size(); i++) {       //через for
            System.out.println(collection.get(i));
        }
    }
}

//List collection = new ArrayList();
//Максимально похож на Array, работает с индексами
//add get set remove