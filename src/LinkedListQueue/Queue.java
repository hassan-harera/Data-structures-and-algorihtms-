package LinkedListQueue;

public class Queue {

    private LinkedList l;

    public Queue() {
        l = new LinkedList();
    }

    public int poll() {
        int returnValue = l.getHead();
        l.delete(0);
        return returnValue;
    }

    public Boolean remove() {
        return l.delete(0);
    }

    public void add(int a) {
        l.add(a);
    }

    public int peek() {
        int returnValue = l.getHead();
        return returnValue;
    }

    public void clear() {
        while (l.delete(0)) {
        }
    }

    class LinkedList {

        private Node head;
        private Node tail;
        private int size;

        private LinkedList() {
            head = null;
            size = 0;
        }

        private void add(int val) {

            if (head == null) {
                head = new Node(val);
                tail = head;
            } else {
                tail.next = new Node(val);
                tail = tail.next;
            }
            size++;
        }

        private void printLinkedList() {
            printLinkedList(head);
        }

        private void printLinkedList(Node head) {
            if (head == null) {
                return;
            }
            System.out.println(head.val);
            printLinkedList(head.next);
        }

        private void reverseLinkedList() {
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

        private Boolean insertAtFirst(int value) {
            Node n = new Node(value);
            n.next = head;
            head = n;
            size++;
            return true;
        }

        private Boolean insertAt(int value, int index) {
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

        private Boolean delete(int index) {
            if (index < 0 || index >= size) {
                return false;
            }
            head = delete(index, head, head.next, 1);
            size--;
            return true;
        }

        private int getHead() {
            if (size <= 0) {
                return -1;
            }
            return head.val;
        }

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
}
