package labs_examples.datastructures_algorithms.examples.linkedlist.labs;

import sun.awt.image.ImageWatched;

import java.util.Iterator;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

public class Exercise_02 {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("0");
        linkedList.addFirst("1");
        linkedList.addFirst("2");
        linkedList.addLast("3");
        linkedList.addLast("4");
        linkedList.addLast("5");

        Node node = linkedList.head;
        while(node.next != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    static class LinkedList {

        Node head;

        public LinkedList() {
            head = new Node(null);
        }


        public void addFirst(String value) {
            Node node = new Node(value);
            node.next = head;
            head = node;
        }

        public void addLast(String value) {
            Node currentNode = head;
            while(currentNode.next.value != null) {
                currentNode = currentNode.next;
            }
            Node node = new Node(value);
            currentNode.next = node;
            node.next = new Node(null);
        }
    }

    static class Node {
        String value;
        Node next;

        public Node() {}

        public Node(String value) {
            this.value = value;
            this.next = null;
        }
    }
}