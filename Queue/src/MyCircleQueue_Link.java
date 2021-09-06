
class QueueNode {
    int val;
    QueueNode next;
    public QueueNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyCircleQueue_Link {
    int count; //队列中元素的个数
    int capacity; // 数组的容量
    QueueNode head, tail;

    public MyCircleQueue_Link(int capacity) {
        this.capacity = capacity;
    }

    public boolean enQueue(int value) {
        if (capacity == count)
            return false;
        QueueNode newNode = new QueueNode(value);
        if (count == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
        return true;
    }

    public boolean deQueue() {
        if (count == 0)
            return false;
        head = head.next;
        count--;
        return true;
    }

    public int front() {
       if (count == 0)
           return -1;
       return head.val;
    }

    public int rear() {
       if (count == 0)
           return -1;
       return tail.val;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

}
