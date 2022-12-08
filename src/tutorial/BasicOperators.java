package tutorial;

public class BasicOperators {
    public static void main(String[] args) {
        // 1. by doing so we declare x as an int 
        // when we print there will be error
        int x;
        // once declare variable we can call x without int
        // by declaring a value we initialise x and now there will be no error when we print
        x = 6;
        int y = 7;
        int z = 10;
        int sum1 = x + y + z;
        // when we divide 10 by 7 we get 1.42857...
        // z & y is int hence console return 1.0
        // to get the correct figure we can cast or change one of the variable to double
        double sum2 = z / (double)y;
        // arithmetic operators
        // BODMAS according to importance
        // B - Brackets
        // O - Orders (power/indices or roots)
        // D - Division
        // M - Multiplication
        // A - Addition
        // S - Subtraction
        System.out.println(x);
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
