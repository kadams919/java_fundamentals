package labs_examples.datastructures_algorithms.examples.stack.labs;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.List;

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
        Stack<Integer> stack = new Stack<Integer>();

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

class Stack<T> {

    T[] stack;
    int position = 0;

    public Stack() {

        stack = (T[])new Object[10];

    }

    public void push(T obj) {

        stack = resize();
        stack[position] = obj;
        position++;

    }

    public void pop() throws EmptyStackException {

        if(position < 0) {

            throw new EmptyStackException("The stack is empty.");

        } else {

            stack = resize();
            position--;
            stack[position] = null;
        }

    }

    public void peekFirst() throws EmptyStackException {

        if(position < 0) {

            throw new EmptyStackException("The stack is empty.");

        } else {
            System.out.println(stack[0]);
        }
    }

    public void peekLast() throws EmptyStackException {

        if(position < 0) {

            throw new EmptyStackException("The stack is empty");

        } else {

            System.out.println(stack[position - 1]);
        }
    }

    public int size() {

        return position;

    }

    public T[] resize() {

        if(position > 10 && position > (double)(stack.length * 0.75)) {

            T[] newStack = (T[]) new Object[stack.length * 2];

            for(int i = 0; i < newStack.length; i++) {
                if(stack[i] != null) {
                    newStack[i] = stack[i];
                }
            }

            return newStack;

        } else if(position > 10 && position < (double)(stack.length * 0.25)) {

            T[] newStack = (T[]) new Object[stack.length / 2];

            for(int i = 0; i < newStack.length; i++) {
                if(stack[i] != null) {
                    newStack[i] = stack[i];
                }
            }

            return newStack;
        }

        return stack;

    }

    public void print() {
        for(int i = 0; i < position; i++) {
            System.out.println(stack[i]);
        }
    }

}

class EmptyStackException extends Exception {

    EmptyStackException(String s) {

        super(s);

    }

}
