public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(3);
        stack.push(-1);
        System.out.println(stack.getMin());
    }
}
