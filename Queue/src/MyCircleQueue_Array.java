/**
 * 循环队列用数组的方式更好表示
 */
public class MyCircleQueue_Array {
    int[] Array;
    int capacity;
    int count;
    int headIndex;

    public MyCircleQueue_Array(int capacity) {
        Array = new int[capacity];
        this.capacity = capacity;
        count = 0;
        headIndex = 0;
    }

    public boolean enQueue(int value) {
        if (count == capacity)
            return false;
        Array[(headIndex+count) % capacity] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (count == 0)
            return false;
        headIndex = (headIndex+1) % capacity;
        count--;
        return true;
    }

    public int front() {
        if (count == 0)
            return -1;
        return Array[headIndex];
    }

    /**
     * tail = (headIndex+count-1) % capacity
     * @return
     */
    public int rear() {
        if (count == 0)
            return -1;
        return Array[(headIndex+count-1) % capacity];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}
