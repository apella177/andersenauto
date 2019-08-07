package Task14.Collection;

import java.util.*;

public class QueueTask {
    public static void main(String[] args) {
        Queue collection = new PriorityQueue();                   //Через PriorityQueue - выводит упорядоченно (1,2,3)
        //Queue collection = new LinkedList();                    //Через LinkedList - выводит дефолтно (1,2,3)
        collection.add("1");
        collection.offer("3");
        collection.offer("2");
        while (collection.size() > 0) {
            System.out.println(collection.poll());                 //Проходит по коллекции и удаляет каждый эдемент
        }
        System.out.println("Оставшиеся элементы" + " " + collection.size());  //Итог: 0 оставшихся элементов
    }
}







//Queue collection = new PriorityQueue()
//Отсортированные очереди
//add == offer,  remove - есть
//get set - нет методов
//peek - возвращает текущий элемент poll - возвращает элемент и удаляет его
