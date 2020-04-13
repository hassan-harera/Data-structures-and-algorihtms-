package LinkeListStack;

public class StackDemo {

    public static void main(String[] args) {
        Stack s = new Stack();

        for (int i = 1; i <= 10; i++) {
            s.add(i);
        }

        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());
        System.out.println(s.pull());
        System.out.println(s.peek());

        s.clear();
        System.out.println(s.pull());

    }
}
