package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
public class Exercise_01 {

    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch(ArithmeticException exc) {
            System.out.println("Cannot divide by zero.");
        }
    }

}

