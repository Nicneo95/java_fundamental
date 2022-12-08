package tutorial;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        
        Map m = new HashMap();
        String str = "hello my name is tim and i am cool";
        // convert str to array of char ['h', 'e', etc...]
        for(char x:str.toCharArray()) {
            // check if the map conatin the letter as the key
            if(m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old+1);
            } else {
                m.put(x, 1);
            }
        }

        m.remove(' ');
        
        System.out.println(m);
    }
}
