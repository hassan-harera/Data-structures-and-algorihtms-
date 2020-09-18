package Check_Balanced_Parentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(check(in.readLine()));
    }

    public static Boolean check(String str) {
        Stack<Character> s = new Stack<>();
        
        
        if (str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') {
                    return false; 
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.add(str.charAt(i));
            } else if (str.charAt(i) == ')'){
                if(s.pop() != '('){
                    return false; 
            }
            } else if (str.charAt(i) == '}'){
                                if(s.pop() != '{'){
                    return false; 
            }
            } else if (str.charAt(i) == ']'){
                                                if(s.pop() != '['){
                    return false; 
            }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
}
