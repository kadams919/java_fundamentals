package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2};

        try {
            System.out.println(arr[3]);
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Exception caught");
        }

    }

}