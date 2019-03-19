package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */
public class Exercise_06 {

    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught in main method.");
        }
    }

    public static void firstMethod() throws ArithmeticException {
        secondMethod();
    }

    public static void secondMethod() throws ArithmeticException {

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException exc) {
            System.out.println("Throwing exception to first method.");
            throw exc;
        }

    }

}