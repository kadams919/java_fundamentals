package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
public class Exercise_02 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
    }
}

class MyThread extends Thread {

    Thread thread;

    public MyThread() {
        thread = new Thread(this, "threadOne");
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Thread started and running.");
    }
}
