/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfixToPostFix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author harera
 */
public class InfixToPostfix {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String infix = in.readLine();

        Queue<String> nums = new LinkedList();
        Stack<String> ops = new Stack();

        for (int i = 0; i < infix.length(); i++) {
            if (Character.isDigit(infix.charAt(i))) {
                nums.add(infix.charAt(i) + "");
            } else if (infix.charAt(i) == '+' || infix.charAt(i) == '*' || infix.charAt(i) == '-' || infix.charAt(i) == '/') {
                if (!ops.isEmpty() && Character.isDigit(nums.peek().charAt(0))) {
                    nums.add(ops.peek());
                    ops.push(infix.charAt(i) + "");
                } else {
                    ops.push(infix.charAt(i) + "");
                }
            }
        }
        nums.add(ops.peek());

        String res = "";

        for (String num : nums) {
            res += num;
        }

        System.out.println(res);

        Integer op1 = Integer.parseInt(nums.poll());
        Integer op2 = Integer.parseInt(nums.poll());
        char oper = nums.poll().charAt(0);

        int ans = 0;
        if (oper == '+') {
            ans = op1 + op2;
        } else if (oper == '/') {
            ans = op1 / op2;
        } else if (oper == '-') {
            ans = op1 - op2;
        } else {
            ans = op1 * op2;
        }

        op1 = ans;
        while (!nums.isEmpty()) {
            op2 = Integer.parseInt(nums.poll());
            oper = nums.poll().charAt(0);
            if (oper == '+') {
                op1 = op1 + op2;
            } else if (oper == '/') {
                op1 = op1 / op2;
            } else if (oper == '-') {
                op1 = op1 - op2;
            } else {
                op1 = op1 * op2;
            }
        }
        System.out.println(op1);

    }
}
