package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

public class Exercise_04 {
    public static void main(String[] args) {

        Sum sum = new Sum();
        SyncThread1 t1 = new SyncThread1(sum);
        SyncThread1 t2 = new SyncThread1(sum);
        t1.start();
        t2.start();
        System.out.println(sum.sum);

    }
}

class SyncThread1 extends Thread {

    Sum sum = null;

    public SyncThread1(Sum sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        add(sum);
    }

    public synchronized void add(Sum sum) {
        for(int i = 0; i < 5; i++) {
            sum.add();
        }
    }
}

class Sum {
    int sum = 0;
    public void add() {
        sum++;
        System.out.println(sum);
    }
}

