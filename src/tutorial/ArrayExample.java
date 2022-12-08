package tutorial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Arrays are collection of element with a fix sizes
        // 1. declare the type of array you want it to be 
        // 2. new int[] - declare the size of the array
        // in this case can store 5 element starting from index 0 - 4
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        String[] fruit = new String[4];
        fruit[0] = "apple";
        fruit[1] = "orange";
        fruit[2] = "pear";
        fruit[3] = "mango";

        String favouriteFruit = fruit[3];

        // another way of declaring arrays using {}
        String[] names = {"john", "bala", "alex"};
        
        System.out.println(num[0]);
        System.out.println(favouriteFruit);
    }
}
