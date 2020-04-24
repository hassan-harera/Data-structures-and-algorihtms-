package SingleLinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        for (int i = 1; i < 10; i++) {
            l.add(i);
        }
        l.revers();
        l.printLinkedList();

    }

}
