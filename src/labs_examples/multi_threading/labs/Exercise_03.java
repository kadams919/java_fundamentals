package labs_examples.multi_threading.labs;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.start();
        thread1.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}

class Thread1 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 8; i++) {
                System.out.println("Thread1 is called");
        }
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 8; i++) {
                System.out.println("Thread2 is called");
        }
    }
}


class Thread3 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 8; i++) {
                System.out.println("Thread3 is called");
        }
    }
}
