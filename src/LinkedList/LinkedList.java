package LinkedList;

public class LinkedList<type extends Object> {

    Node<type> head;
    Node<type> tail;

    public LinkedList() {
    }

    public LinkedList(type head) {
        this.head = new Node(head);
        this.tail = this.head;
    }

    public void add(type t) {
        if (this.head == null) {
            this.head = new Node(t);
            this.tail = this.head;
            return;
        }

        Node node = new Node(t);
        tail.next = node;
        node.previous = tail;
        tail = node;
    }

    public void printLinkedListFromHead() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }

    public void printLinkedListFromTail() {
        Node n = tail;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.previous;
        }
    }

}
