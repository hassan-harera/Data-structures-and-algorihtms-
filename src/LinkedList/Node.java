package LinkedList;

public class Node <type extends Object>{
    
    Node next, previous;
    type value;

    public Node(type value) {
        this.next = null;
        this.previous = null;
        this.value = value;
    }
}
