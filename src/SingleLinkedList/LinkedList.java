package SingleLinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int a) {
        head = add(head, a);
    }

    private Node add(Node head, int val) {

        if (head == null) {
            head = new Node(val);
        } else {
            head.next = add(head.next, val);
        }
        return head;
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

    public void revers() {
        head = revers(head, new ArrayList());
    }

    /*
    Describe in detail an algorithm for reversing a singly linked list L using only a
    constant amount of additional space and not using any recursion.  O(2n) = O(n)
     */
    private Node revers(Node head, List<Node> l) {
        while (head != null) {
            l.add((head));
            head = head.next;
        }
        for (int i = l.size() - 1; i > 0; i--) {
            l.get(i - 1).next = null;
            l.get(i).next = l.get(i - 1);
        }
        return l.get(l.size() - 1);
    }

}

class Node {

    Node next;
    int val;

    public Node(int val) {
        next = null;
        this.val = val;
    }

}
