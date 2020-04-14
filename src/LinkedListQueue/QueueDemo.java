package LinkedListQueue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue q = new Queue();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        q.remove();
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());

        q.clear();
        System.out.println(q.peek());
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());

        // all is removed so it will return -1
        System.out.println(q.peek());
        q.clear();
        System.out.println(q.poll());

    }
}
