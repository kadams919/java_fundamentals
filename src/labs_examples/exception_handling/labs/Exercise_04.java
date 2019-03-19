package labs_examples.exception_handling.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {

        try {

            List<Integer> list = new ArrayList<Integer>();

            try {
                for(int i : list) {
                    System.out.println(i);
                }
                System.out.println(list.get(0));

            } catch (IndexOutOfBoundsException exc) {
                System.out.println("Default array being used.");
                list.add(2);
                list.add(0);
            }

            System.out.println(list.get(0) / list.get(1));
        } catch (ArithmeticException exc) {
            System.out.println("Cannot divide by zero.");
        }

    }

}
