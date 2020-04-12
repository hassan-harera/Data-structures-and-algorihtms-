package DoubleLinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        for (int i = 1; i < 10; i++) {
            l.add(i);
        }
        l.printLinkedList();
        System.out.println("----------");
        l.delete(4);
        l.printLinkedList();
        System.out.println("----------");
        l.insertAt(30, 5);
        l.insertAt(40, 5);
        l.printLinkedList();
        System.out.println("----------");
        l.reverseLinkedList();
        l.printLinkedList();
        System.out.println("----------");
        l.delete(10);
        l.printLinkedList();

    }

}
