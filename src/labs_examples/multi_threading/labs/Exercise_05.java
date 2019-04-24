package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Message message = new Message();
        Sender sender = new Sender(message);
        Receiver receiver = new Receiver(message);
        System.out.println(message.content);
        sender.send();
        System.out.println(message.content);
        receiver.receive();
        System.out.println(message.content);
    }
}

class Sender extends Thread {

    Message message;

    public Sender(Message message) {
        this.message = message;
    }

    public synchronized void send() {
        while(!message.sending) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        message.sending = false;
        message.content = "sent";
        notifyAll();
    }
}

class Message {
    String content = "Message status pending";
    boolean sending = true;
}

class Receiver extends Thread {

    Message message;

    public Receiver(Message message) {
        this.message = message;
    }

    public synchronized void receive() {
        while(message.sending) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }        }
        message.sending = true;
        message.content = "received";
        notifyAll();
    }
}