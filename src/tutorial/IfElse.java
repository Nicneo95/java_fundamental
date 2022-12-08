package tutorial;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.equals("tim")) {
            System.out.println("Hello Tim!");
        } else if(s.equalsIgnoreCase("john")) {
            System.out.println("Hello John!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
