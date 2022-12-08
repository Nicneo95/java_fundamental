package tutorial;

import java.util.ArrayList;
import java.util.List;

public class BasicLists {
    public static void main(String[] args) {
        // array list there is no fixed size
        ArrayList<Integer> t = new ArrayList<Integer>();
        // .add() - add element to array list
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        // .get() - retrive the element from index
        int x = t.get(0);
        // .set() - change index 0 element to 5
        t.set(0, 5);
        // .size() - the size of the array
        int y = t.size();
        // .isEmpty() - return true/false
        boolean a = t.isEmpty();
        // .subList() - specify from which index - which index you want to extract the element from 
        // index 3 will not be included
        List<Integer> b = t.subList(0, 3);

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);

        /*
         LinkedList - another data structure faster in certain operation than ArrayList 
         */
    }
}
