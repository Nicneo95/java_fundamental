package tutorial;
// import scanner from java library
import java.util.Scanner;

public class ScannerClass {
   
    public static void main(String[] args) {
        // this new scanner is going to be System.in
        // basically means typing on keyboard "input"
        Scanner sc = new Scanner(System.in);
        // next() is for string 
        String scanned = sc.next();
        // nextInt() for int
        // check doccumentation for Scanner classes 
        int num1 = sc.nextInt();
        /*
            if we print x it will be "3"
            to convert "3" to 3 we use Integer.parseInt
        */ 
        int x = Integer.parseInt(scanned);

        System.out.println(scanned);
        System.out.println(num1);
        System.out.println(x);
    }
}
