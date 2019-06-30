package labs_examples.datastructures_algorithms.examples.queue.labs;

import sun.misc.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dump("one");

        try {
            queue.dequeue(2);
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println(queue.elements());

        System.out.println(queue.isEmpty());

        queue.reverseElements();

    }
}
