import java.net.Inet4Address;
import java.util.*;

public class DoubleEndedQueue {
    Deque<Integer> deque;
    Queue<Integer> queue;
    public DoubleEndedQueue() {
       deque = new LinkedList<>();
       queue = new LinkedList<>();
    }

    public int max_value() {
        if(deque.isEmpty()){
            return -1;
        }
        return deque.peekFirst();
    }

    public void push_back(int value) {
        while(!deque.isEmpty()&&deque.peekLast()<value) {
            deque.pollLast();
        }
        deque.offerLast(value);
        queue.offer(value);
    }

    public int pop_front() {
        if(queue.isEmpty()) {
            return -1;
        }
        int temp = queue.poll();
        if(temp==deque.peekFirst()) {
            deque.pollFirst();
        }
        return temp;
    }

}
