package Task14.Collection;

import java.util.*;

public class MapTask {
    public static void main(String[] args) {
        Map <Integer, String> map1 = new HashMap<>();              //хранение объетов на основании хэшов
//        Map <Integer, String> map1 = new Hashtable<>();
//        Map <Integer, String> map1 = new LinkedHashMap<>();
//        Map <Integer, String> map1 = new TreeMap<>();
        map1.put(1,"Pushkin");
        map1.put(2,"Gogol");
        map1.put(3,"Lermontov");
        System.out.println(map1.get(2));          //вывод объекта по ключу 2 = Gogol
        Set set = map1.entrySet();                //пройти по коллекции через entrySet
        for (Object o: set) {System.out.println(o); }
    }
}









//Map collection = new HashMap()
//Не наследуется от коллекций, но относится к ним
//Put - положить
//add - нет метода
//get remove
//size
//добавляет значение по ключу (ключ - значение)