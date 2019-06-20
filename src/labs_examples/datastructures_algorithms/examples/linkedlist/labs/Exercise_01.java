package labs_examples.datastructures_algorithms.examples.linkedlist.labs;

import java.util.*;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Exercise_01 {

    public static void main(String[] args) {

        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(2);

        Integer[] intArray = {2,3,4,5};

        intList.addAll(Arrays.asList(intArray));

        intList.addFirst(9);

        intList.addLast(1);

        System.out.println(intList.getFirst());

        System.out.println(intList.getLast());

        System.out.println(intList.get(0));

        intList.set(0,3);

        intList.push(13);

        intList.pop();

        intList.remove(1);

        System.out.println(intList.contains(2));

        ListIterator iterator = intList.listIterator(0);

        while(iterator.hasNext()) {
            System.out.println("next!");
            iterator.next();
        }

        intList.clear();

    }
}