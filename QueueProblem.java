package pushpak32queuequation;
import java.util.*;

public class QueueProblem {
    public static void main(String[] args) {
        //1
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.top());

        //10
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);
        System.out.println(deque);

        //5
        System.out.println("Generate Binary Numbers:");
        generateBinaryNumbers(5);


    }
    // 1. Stack using two queues
    static class StackUsingQueues {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {
            q2.offer(x);
            while (!q1.isEmpty()) {
                q2.offer(q1.poll());
            }
            q1.offer(x);
            while (!q2.isEmpty()){
                q1.offer(q2.poll());
            }
        }
        public int pop() {
            return q1.poll();
        }
        public int top() {
            return q1.peek();
        }
    }
    // 5. Generate Binary Numbers
    public static void generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (n-- > 0) {
            String s = q.poll();
            System.out.print(s );
            q.offer(s + "0");
            q.offer(s + "1");
        }
        System.out.println();
    }
    // 10. Implement Deque
    public static class MyDeque {
        LinkedList<Integer> deque = new LinkedList<>();

        public void addFirst(int x) {
            deque.addFirst(x);
        }

        public void addLast(int x) {
            deque.addLast(x);
        }

        public int removeFirst() {
            return deque.removeFirst();
        }

        public int removeLast() {
            return deque.removeLast();
        }
    }




}
