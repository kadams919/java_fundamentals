package labs_examples.datastructures_algorithms.examples.queue.labs;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(3);
            queue.add(3);
            queue.add(3);
            queue.add(3);
            queue.add(3);
            queue.add(3);
            queue.add(3);
            queue.print();
            queue.remove();
            queue.print();
            queue.peekFirst();
            queue.peekLast();
            System.out.println(queue.size());
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

class Queue<T> {

    T[] queue;
    int position = 0;

    public Queue() {

        queue = (T[])new Object[10];

    }

    public void add(T obj) {
        queue = resize();
        queue[position] = obj;
        position++;
    }

    public void remove() {
        queue = resize();
        queue[0] = null;
        T[] newQueue;
        if(size() > 10)  {
            newQueue = (T[]) new Object[queue.length - 1];
            for(int i = 0; i < newQueue.length; i++) {
                newQueue[i] = queue[i + 1];
            }
        } else {
            newQueue = (T[]) new Object[10];
            for(int i = 0; i < 9; i++) {
                newQueue[i] = queue[i + 1];
            }
        }
        position--;
        queue = newQueue;
    }

    public void peekFirst() throws EmptyQueueException {

        if(position < 0) {

            throw new EmptyQueueException("The stack is empty.");

        } else {
            System.out.println(queue[0]);
        }
    }

    public void peekLast() throws EmptyQueueException {

        if(position < 0) {

            throw new EmptyQueueException("The stack is empty");

        } else {

            System.out.println(queue[position - 1]);
        }
    }

    public int size() {

        return position;

    }

    public T[] resize() {

        if(position > 10 && position > (double)(queue.length * 0.75)) {

            T[] newQueue = (T[]) new Object[queue.length * 2];

            for(int i = 0; i < newQueue.length; i++) {
                if(queue[i] != null) {
                    newQueue[i] = queue[i];
                }
            }

            return newQueue;

        } else if(position > 10 && position < (double)(queue.length * 0.25)) {

            T[] newQueue = (T[]) new Object[queue.length / 2];

            for(int i = 0; i < newQueue.length; i++) {
                if(queue[i] != null) {
                    newQueue[i] = queue[i];
                }
            }

            return newQueue;
        }

        return queue;

    }

    public void print() {
        for (int i = 0; i < position; i++) {
            System.out.println(queue[i]);
        }
    }


}


class EmptyQueueException extends Exception {

    EmptyQueueException(String s) {

        super(s);

    }

}
