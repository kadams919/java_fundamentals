package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 0};

        try {
            System.out.println(arr[1] / arr[2]);
        } catch(IndexOutOfBoundsException exc) {
            System.out.println("Element does not exist");
        } catch(ArithmeticException exc) {
            System.out.println("Cannot divide by zero");
        }
    }

}


