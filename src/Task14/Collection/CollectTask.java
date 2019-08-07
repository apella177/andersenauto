package Task14.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectTask {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add(1);
        collection1.add(2);
        collection1.remove(2);
        collection1.add("String");
        collection1.add(2.0);

        for (Object o : collection1) System.out.println(o);
    }
}







//Интерфейсы, наследуемые от коллекций:
//List collection = new ArrayList();
//Set collection = new HashSet();
//Queue collection = new PriorityQueue();

//Не наследуется от коллекций, но относится к ним:
//Map collection = new HashMap();






