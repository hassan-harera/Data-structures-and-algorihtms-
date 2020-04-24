package DoubleLinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(int val) {

        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
        size++;
    }

    public void printLinkedList() {
        printLinkedList(head);
    }

    private void printLinkedList(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.val);
        printLinkedList(head.next);
    }

    public void reverseLinkedList() {
        tail = reverseLinkedList(head, tail);
    }

    private Node reverseLinkedList(Node head, Node tail) {
        if (head == tail) {
            this.head = tail;
            return head;
        }
        reverseLinkedList(head.next, tail);
        size--;
        add(head.val);
        return head;
    }

    public Boolean insertAt(int value, int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        head = insertAt(value, index, head, 0);
        size++;
        return true;
    }

    private Node insertAt(int value, int index, Node head, int c) {

        if (index == 0) {
            Node curr = new Node(value);
            curr.next = head;
            return curr;
        }

        if (c == index - 1) {
            Node curr = new Node(value);
            curr.next = head.next;
            head.next = curr;
            return head;
        }

        insertAt(value, index, head.next, c + 1);
        return head;
    }

    public static LinkedList concat(LinkedList l, LinkedList r) {

        /*
        Give a fast algorithm for concatenating two doubly linked lists L and M, with
        header and trailer sentinel nodes, into a single list L ′   O(1).
         */
        
        Node head = l.head;
        Node tail = r.head;

        l.tail.next = r.head;

        l.head = head;
        l.tail = tail;

        return l;
    }

    public Boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        head = delete(index, head, head.next, 1);
        size--;
        return true;
    }

    /*
    Describe in detail how to swap two nodes x and y in a singly linked list L given
references only to x and y. Repeat this exercise for the case when L is a doubly
linked list. Which algorithm takes more time? 
    this method can give a solution  O(n)
     */
    private Node delete(int index, Node left, Node next, int c) {

        if (index == 0) {
            return next;
        }

        if (c == index) {
            left.next = next.next;
            return left;
        }

        delete(index, left.next, next.next, c + 1);
        return left;

    }
}

class Node {

    Node next;
    Node before;
    int val;

    public Node(int val) {
        next = null;
        before = null;
        this.val = val;
    }

}
