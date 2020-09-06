package LinkedList;


public class LinkedListDemo {
 
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 2; i < 5; i++) {
            linkedList.add(i);
        }
        
        linkedList.printLinkedListFromHead();
        linkedList.printLinkedListFromTail();
    }
    
}
