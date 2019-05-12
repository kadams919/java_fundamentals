package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */
public class Exercise_02 {

    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Generic_02.add(arr);

    }


}

class Generic_02 {
    public static <N extends Number> double add(ArrayList<N> arr) {
        double sum = 0;
        for(N num : arr) {
            sum += num.doubleValue();
        }
        System.out.println(sum);
        return sum;
    }
}
