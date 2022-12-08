package tutorial;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number:");
        int x = sc.nextInt();
        // while x is not equal to 10 the loop will continue to run until it is true
        while (x != 10) {
            System.out.println("Type 10 to exit!");
            System.out.print("Type a number:");
            x = sc.nextInt();
        }
        // do while loop will execute the do code block once no matter true/false
        int a;
        do {
            System.out.print("Type a number:");
            a = sc.nextInt();
        } while (a != 10);
    }
}
