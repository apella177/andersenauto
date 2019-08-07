package Task14.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {
        Set collection = new HashSet();                      //неупорядоченная коллекция
        //Set collection = new LinkedHashSet();              //упорядоченная коллекция
        //Set collection = new TreeHashSet();                //отсортированная коллекция
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("3");
        collection.add("3");
        collection.add("3");
        for (Object o : collection) {
            System.out.println(o);
        }

    }
}

//Set collection = new HashSet()        - неупорядоченная коллекция
//Set collection = new LinkedHashSet(); - упорядоченная коллекция
//Set collection = new TreeHashSet();   - отсортированная коллекция
//Коллекция уникальных объектов, выводит неповторяющиеся объекты
//add remove