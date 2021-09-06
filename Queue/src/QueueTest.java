public class QueueTest {
    public static void main(String[] args) {
        MyCircleQueue_Array queue_array = new MyCircleQueue_Array(5);
        queue_array.enQueue(2);
        queue_array.enQueue(9);
        System.out.println(queue_array.front());
        System.out.println(queue_array.rear());
    }
}
