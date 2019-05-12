package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a collection of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 *      5)
 */
public class Exercise_03 {

    public static void main(String[] args) {

        int n1 = 3;
        double n2 = 4;
        System.out.println(Generic_03.add(n1, n2));

        List<String> arr0 = new ArrayList();
        arr0.addAll(Arrays.asList("notpalindrome", "racecar"));
        System.out.println(Generic_03.countElements(arr0));

        List<String> arr1 = new ArrayList();
        arr1.addAll(Arrays.asList("1", "2", "3", "4"));
        System.out.println(Generic_03.exchangeElements(arr1, 2,3));

        List<Integer> arr2 = new ArrayList();
        arr2.addAll(Arrays.asList(1,2,3,4));
        System.out.println(Generic_03.findLargest(arr2));
    }
}

class Generic_03 {
    public static <N extends Number> double add(N n1, N n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

    public static <T extends String> int countElements(List<T> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            boolean palindrome = true;
            String word = list.get(i).toString();
            for(int j = 0; j < list.get(i).length() / 2; j++) {
                if(word.charAt(j) != word.charAt(word.length() - 1 - j)) {
                    palindrome = false;
                    break;
                }
            }
            if (palindrome) {
                count++;
            }
        }

        return count;
    }

    public static <T, N extends Number> String exchangeElements(List<T> arr, N pos1, N pos2) {
        int first = 0;
        int second = 0;
        List<String> newArr = new ArrayList();
        if (pos1.doubleValue() > pos2.doubleValue()) {
            first = pos1.intValue();
            second = pos2.intValue();
        } else {
            first = pos2.intValue();
            second = pos1.intValue();        }
        for (int i = 0; i < arr.size(); i++) {
            if(i == first) {
                newArr.add(i, arr.get(second).toString());
            } else if (i == second) {
                newArr.add(i, arr.get(first).toString());
            } else {
                newArr.add(i, arr.get(i).toString());
            }
        }
        return newArr.toString();
    }

    public static <N extends Number> Double findLargest(List<N> list) {
        double largest = 0.0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() > largest) {
                largest = list.get(i).doubleValue();
            }
        }

        return largest;
    }
}