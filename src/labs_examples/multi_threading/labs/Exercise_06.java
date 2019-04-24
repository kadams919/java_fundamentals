package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {
    public static void main(String[] args) {
        Num num = new Num();
        FirstThread t1 = new FirstThread(num);
        SecondThread t2 = new SecondThread(num);
        int count = 0;

        while(count < 50) {
            t1.add();
            t2.add();
            count++;
        }
    }
}

class FirstThread extends Thread {

    Num num;

    public FirstThread(Num num) {
        this.num = num;
    }

    public synchronized void add() {
        while(!num.status) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(num.count++);
        num.status = false;
        notifyAll();
    }
}

class SecondThread extends Thread {

    Num num;

    public SecondThread(Num num) {
        this.num = num;
    }

    public synchronized void add() {
        while(num.status) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(num.count++);
        num.status = true;
        notifyAll();
    }
}

class Num {
    boolean status = true;
    int count = 1;
}
