package tutorial;

import java.util.Scanner;

public class NestedStatement {
    public static void main(String[] args){
        // this will run first 
        System.out.println("Input your age: ");
        Scanner sc = new Scanner(System.in);
        // user will input their age 
        String s = sc.nextLine();
        // user input string age will be convert into int
        int age = Integer.parseInt(s);

        // first condition if 18 we ask their favourite food 
        if(age >= 18) {
            System.out.println("What is your favourite food?");
            String food = sc.nextLine();

            if(food.equalsIgnoreCase("pizza")) {
                System.out.println("Mine too!");
            } else {
                System.out.println("We are not in the same team");
            }
        } else if(age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not a teenager or adult");
        }
    }
}
