import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStack {
    List<Integer> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return list.isEmpty();
    }
    /** Get the top item from the queue. */
    public int top() {
        if (isEmpty())
            return -1;
        return list.get(list.size()-1);
    }
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean pop() {
        if (isEmpty())
            return false;
        list.remove(list.size()-1);
        return true;
    }

    public int getMin() {
        List<Integer> temp = new ArrayList<>();
        for (Integer integer : list) {
            temp.add(integer);
        }
        Collections.sort(temp);
        return temp.get(0);
    }
}
