package QueueUsingTwoStacks;

import java.util.*;

public class Solution {

    private static Stack<Integer> s1;
    private static Stack<Integer> s2;

    public static void main(String[] args) {

        /*
        Describe how to implement the queue ADT using two stacks. What is the
running time of the enqueue() and dequeue() methods in this case? 
         */
        s1 = new Stack();
        s2 = new Stack();

        for (int i = 0; i < 5; i++) {
            enqueue(i + 3);
        }
        System.out.println(dequeue());
        enqueue(333);
        System.out.println(dequeue());
        enqueue(44);
        System.out.println(dequeue());
        enqueue(555);
        for (int i = 0; i < 5; i++) {
            System.out.println(dequeue());
        }

    }

    public static Boolean enqueue(int a) {
        s1.add(a);
        return true;
    }

    public static int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.add(s1.pop());
            }
        }
        return s2.pop();
    }
}
