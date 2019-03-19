package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 0};

        try {
            System.out.println(arr[1] / arr[2]);
        } catch(ArithmeticException exc) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("All done!");
        }
    }

}