package tutorial;

import java.util.HashSet;
import java.util.Set;

public class BasicSets {
    public static void main(String[] args) {
        // collection of unordered elements
        // cannot contain same element twice
        // doesn't know where the element exist
        // can only be unique things
        Set<Integer> t = new HashSet<Integer>();
        // .add() - command to add to a set
        t.add(1);
        t.add(2);
        // notice when print 1 doesn't appear 2 times
        t.add(1);
        t.add(3);
        t.add(4);
        t.add(-4);
        t.add(-10);
        t.add(-8);
        // .remove() - remove element from set 
        t.remove(-10);
        // .contain() - find the element in the set there is not index like array 
        t.contains(1);
        // .size() - find the size of set in this case 6
        int x = t.size();
        // when print no specific order 
        System.out.println(t);
        System.out.println(x);

        /*
         TreeSet - in ordered manner. tree data structure
         LinkedHashSet 
         */
    }
}
