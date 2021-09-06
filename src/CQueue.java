import java.util.ArrayDeque;
import java.util.Deque;

class CQueue {
    Deque<Integer> stack1;//用于维护入栈
    Deque<Integer> stack2;//用于维护出栈
    public CQueue() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }

    public void showQueue() {
        if (stack1.isEmpty()) {
            System.out.println("is empty");
        }
        else {
            while(!stack1.isEmpty()) {
                System.out.println(stack1.pop());
            }
        }
    }

    public static void main(String[] args) {
        CQueue test = new CQueue();
        for(int i=1;i<=10; i+= 2) {
            test.appendTail(i);
        }
//        test.showQueue();
        test.deleteHead();
        test.showQueue();
    }
}