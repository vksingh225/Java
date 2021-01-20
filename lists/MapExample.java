import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        UseHashMap();
    }

    public static void UseHashMap() {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        myMap.put(1, 2);
        myMap.put(1, 3);
        myMap.put(44, 4);
        myMap.put(55, 5);

        myMap.get(1);

        Iterator<Map.Entry<Integer, Integer>> itr = myMap.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        }
        System.out.println("ForEach ==== "); 
        // forEach(action) method to iterate map 
        myMap.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

        // using keySet() for iteration over keys 
        for (Integer key : myMap.keySet())  
            System.out.println("key: " + key); 
          
        // using values() for iteration over keys 
        for (Integer val : myMap.values())  
            System.out.println("value: " + val); 
    }
}
