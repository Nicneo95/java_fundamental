package tutorial;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        // loop a tasks for a set amount of times
        // 1. int i = 0 - we declare a variable 
        // 2. conidtion if i is <= 5 will execute the code block
        // 3. we will increment i + 1
        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        // we delcare an array
        int[] arr = {1,2,3,4,5,6};
        // looping through an array 
        // 1. 0 < length of array 6 we go into the code block
        for(int i = 0; i < arr.length; i++) {
            // arr[i] = 0, 0 is not equals to 5
            // will be false and we will increment i by 1 
            // execute the code outside till i = 5 
            if (arr[i] == 5) {
                System.out.println("Found a 5! at index " + i);
            }
        }
        // for each loop
        // int element is a new variable 
        // :arr - we will loop through the arr[]
        // with this loop we can't check the index 
        for(int element:arr) {
            System.out.println(element);
        }

        // populate name[] by asking for input using for loop
        String[] name = new String[4];
        Scanner sc = new Scanner(System.in);
        // this for loop will ask for input 4 times
        for (int i = 0; i < name.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            name[i] = input;
        }
        // this for loop will print out the name 
        for(String n:name) {
            System.out.println(n);
        }
    }
}
