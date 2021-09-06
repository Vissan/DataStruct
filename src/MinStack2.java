import java.util.ArrayList;
import java.util.Stack;

public class MinStack2 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MinStack2() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if(stack2.isEmpty())
            stack2.push(x);
        else
            stack2.push(Math.min(stack2.peek(), x));
        stack1.push(x);
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
       return stack1.peek();
    }

    public int min() {
       return stack2.peek();
    }

    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.min();
        minStack.pop();
        minStack.top();
        minStack.min();
    }
}
