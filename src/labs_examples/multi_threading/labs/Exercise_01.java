package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
public class Exercise_01 {

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne("threadOne");
        ThreadTwo threadTwo = new ThreadTwo();
        Thread thread = new Thread(threadTwo);
        thread.run();

    }
}

class ThreadOne implements Runnable {

    Thread thread;

    public ThreadOne(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("ThreadOne thread " + thread.getName() + " started.");
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("ThreadTwo thread started.");
    }
}


