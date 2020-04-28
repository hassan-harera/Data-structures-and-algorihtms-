package CircularLinkedList;

import java.util.Random;

public class CircularLinkedListDemo {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        LinkedList l = new LinkedList();
        
        for (int i = 1; i <= 8; i++) {
//            l.add(rand.nextInt(10) + 10);
            l.add(i);
        }
        
        LinkedList r = new LinkedList();
        
        for (int i = 1; i <= 8; i++) {
//            r.add(rand.nextInt(10) + 10);
            r.add(i);
        }
        l.printLinkedList();
        System.out.println("-------");
        r.printLinkedList();
        
        System.out.println(LinkedList.compareTowLinkedLists(l, r));

//        l.printLinkedList();
//        l.splitLinkedList();
//        LinkedList r = new LinkedList();
//        for (int i = 1; i < 10; i++) {
//            r.add(i);
//        }
//        LinkedList nl = LinkedList.concat(l, r);
//        nl.printLinkedList();
//        System.out.println("----------");
//        l.delete(4);
//        System.out.println("----------");
//        l.insertAt(30, 5);
//        l.insertAt(40, 5);
//        l.printLinkedList();
//        System.out.println("----------");
//        l.reverseLinkedList();
//        l.printLinkedList();
//        System.out.println("----------");
//        l.delete(10);
//        l.printLinkedList();
    }
    
}
