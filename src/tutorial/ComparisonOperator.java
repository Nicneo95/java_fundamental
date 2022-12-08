package tutorial;
public class ComparisonOperator {
    public static void main(String[] args) {
        
        int x = 6;
        int y = 9;
        String a = "hello";
        String b = "world";
        /*
        comparison operators: < <= > >= == !=
        return true or false
        */ 
        boolean compare1 = x < y;
        //  to compare String is better to use .equal()
        boolean compare2 = a != b;
        // chaining operators together using && ||
        boolean compare3 = (x + y < y) && (x * x > y);
        /*
        T && T - true 
        T && F - false
        F || F - false
        F || T - ture 
         */
        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);
    }
}
