/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList;

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
        System.out.println(head.next);
        printLinkedList(head.next);
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
