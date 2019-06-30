package labs_examples.datastructures_algorithms.examples.stack.labs;

public class CustomStack<T> {

        T[] stack;
        int position = 0;

        public CustomStack() {

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
            for (int i = 0; i < position; i++) {
                System.out.println(stack[i]);
            }
        }

}

class EmptyStackException extends Exception {

    EmptyStackException(String s) {

        super(s);

    }

}