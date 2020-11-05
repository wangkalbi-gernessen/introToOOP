package collections.list;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        stutter(queue1); // [1, 1, 2, 2, 3, 3]
        Queue<String> queue2 = new ArrayDeque<>();
        queue2.add("a");
        queue2.add("b");
        queue2.add("c");
        mirror(queue2); // ["a", "b", "c", "c", "b", "a"]
    }
    /**
     * Write a function stutter that accepts a queue of integers
     * and replaces every element with two copies of itself.
     *
     * [1, 2, 3] becomes [1, 1, 2, 2, 3, 3]
     */
    public static void stutter(Queue<Integer> q) {
        int length = q.size();
        for(int i = 0; i < length; i++){
            Integer elem = q.poll();
            q.offer(elem);
            q.offer(elem);
        }
    }
    /**
     * Write a function mirror that accepts a queue of strings
     * and appends the queue's contents to itself in reverse order.
     *
     * ["a", "b", "c"] becomes ["a", "b", "c", "c", "b", "a"]
     */
    public static void mirror(Queue<String> q) {
        // queue = [a, b, c]
        // stack = [a,
        Deque<String> stack = new ArrayDeque<>();
        int length = q.size();
        while(length-- > 0){
            String elem = q.poll();
            q.offer(elem);
            stack.push(elem);
        }
        while(!stack.isEmpty()){
//            q.offer(elem);
        }
    }
}