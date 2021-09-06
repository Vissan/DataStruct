import java.util.ArrayList;
import java.util.List;

/**
 * 实现很容易但是不推荐，如果数据量较大时，可能会浪费比较多的空间资源
 */
public class MyQueue {

    List<Integer> list;
    int P_start; //队首指针

    public MyQueue() {
        P_start = 0;
        list = new ArrayList<>();
    }

    public boolean addElement(int val) {
        list.add(val);
        return true;
    }

    public boolean deleteElement() {
        if (list.isEmpty())
            return false;
        P_start++;
        return true;
    }

    public int getElement() {
        return list.get(P_start);
    }

    public boolean isEmpty() {
        return list.size()>=P_start;
    }
}
