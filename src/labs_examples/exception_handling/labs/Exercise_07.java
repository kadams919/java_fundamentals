package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        try {
            if(arr[0] != 0) {
                throw new CustomException();
            }
        } catch (CustomException exc) {
            System.out.println("Invalid value.");
        }
    }
}

class CustomException extends Exception {

    @Override
    public String toString() {
        return "CustomException{Invalid first value}";
    }
}

