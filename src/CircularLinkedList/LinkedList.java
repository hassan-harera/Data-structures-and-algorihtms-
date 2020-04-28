package CircularLinkedList;

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
        } else if (tail == null) {
            tail = new Node(val);
            tail.next = head;
            head.next = tail;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
            tail.next = head;
        }
        size++;
    }

    public void printLinkedList() {
        printLinkedList(head);
    }

    private void printLinkedList(Node head) {
        if (head == tail) {
            System.out.println(head.val);
            return;
        }
        System.out.println(head.val);
        printLinkedList(head.next);
    }

    public void splitLinkedList() {
        splitLinkedList(this, new LinkedList(), new LinkedList(), head, 0, size);

    }

    /*
    Given a circularly linked list L containing an even number of nodes, describe
    how to split L into two circularly linked lists of half the size. 
     */
    private void splitLinkedList(LinkedList o, LinkedList l, LinkedList r, Node head, int curr, int size) {
        if (curr >= size) {
            l.printLinkedList();
            System.out.println("------------");
            r.printLinkedList();
            return;
        }
        if (curr <= size / 2 - 1) {
            l.add(head.val);

        } else {
            r.add(head.val);
        }
        splitLinkedList(o, l, r, head.next, curr + 1, size);

    }

    public static Boolean compareTowLinkedLists(LinkedList l, LinkedList m) {
        return compareTowLinkedLists(l.head, m.head);
    }

    /*
Suppose you are given two circularly linked lists, L and M, that is, two lists of
nodes such that each node has a nonnull next node. Describe a fast algorithm for
telling if L and M are really the same list of nodes, but with different (cursor)
starting points.
     */
    private static Boolean compareTowLinkedLists(Node lh, Node rh) {
        if ((lh == null && rh != null) || (rh == null && lh != null)) {
            return false;
        }
        if (lh == null && rh == null) {
            return true;
        }
        if (!lh.equals(rh)) {
            return false;
        }
        return  compareTowLinkedLists(lh.next, rh.next);
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

    public boolean equals(Node n) {
        return val == n.val;
    }

}
