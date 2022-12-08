package tutorial;

import java.util.HashMap;
import java.util.Map;

public class BasicMap {
    public static void main(String[] args) {
        // map is actually a key/value pair
        // index is by key to access the value
        Map m = new HashMap();
        // .put() - add new key/value pair to map
        m.put("tim", 100);
        m.put(11, 1999);
        m.put(11, "john");
        // key cannot be the same if not the value will be overwrite
        m.put(11, 1998);
        // we can have same value with different key 
        m.put("john", 1998);
        boolean a = m.containsValue("john");

        System.out.println(a);
        System.out.println(m);
        // .get() - access the value by providing key
        System.out.println(m.get("tim"));

        /*
         HashMap doesn't retain order but is faster
         TreeMap is in order, key have to be the same datatype
         LinkedHashMap in order according to the sequence we add them in
         */
    }
}
