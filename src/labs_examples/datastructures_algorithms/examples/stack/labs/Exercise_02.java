package labs_examples.datastructures_algorithms.examples.stack.labs;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following:
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Queue (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.print();
            stack.pop();
            stack.print();
            stack.peekFirst();
            stack.peekLast();
            System.out.println(stack.size());
        } catch(Exception e) {
            System.out.println(e);
        }

    }


}

