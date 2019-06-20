package labs_examples.datastructures_algorithms.examples.linkedlist.labs;

/**
 *      LinkedLists - Exercise_03
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {

    public static void main(String[] args) {
        DoublyLinkedList dblList = new DoublyLinkedList();
        dblList.addFirst("0");
        dblList.addFirst("1");
        dblList.addFirst("2");
        dblList.addLast("3");
        dblList.addLast("4");
        dblList.addLast("5");

        dblList.printList();

    }

    static class DoublyLinkedList {

        Node head;
        Node tail;

        public DoublyLinkedList() {
            Node node = new Node(null);
            head = node;
            tail = node;
        }


        public void addFirst(String value) {
            Node node = new Node(value);
            if(head.value == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                node.previous = null;
                head.previous = node;
                head = node;
            }
        }

        public void addLast(String value) {
            Node node = new Node(value);
            if(tail.value == null) {
                tail = node;
                head = node;
            } else {
                node.next = null;
                node.previous = tail;
                tail.next = node;
                tail = node;
            }
        }

        public void printList() {
            Node node = head;
            while(node != null) {
                System.out.println(node.value);
                node = node.next;
            }
        }
    }

    static class Node {
        String value;
        Node next;
        Node previous;

        public Node() {}

        public Node(String value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }



}
