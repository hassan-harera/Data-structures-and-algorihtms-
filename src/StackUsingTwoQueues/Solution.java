package StackUsingTwoQueues;

import java.util.*;

public class Solution {

    private static Queue<Integer> q1;
    private static Queue<Integer> q2;

    public static void main(String[] args) {

        /*
Describe how to implement the stack ADT using two queues. What is the
running time of the push() and pop() methods in this case?
         */
        q1 = new LinkedList<>();
        q2 = new LinkedList();
        Stack<Integer> s = new Stack();

        for (int i = 1; i <= 5; i++) {
            q1.add(i);
        }
        
        while (!q1.isEmpty()) {
            s.add(q1.poll());
        }

        while (!s.isEmpty()) {
            q2.add(s.pop());
        }

        while (!q2.isEmpty()) {
            s.add(q2.poll());
        }
        
        for (Integer i : s) {
            System.out.println(i);
        }
        
        
    }
}
