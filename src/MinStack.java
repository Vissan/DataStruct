//import javax.xml.soap.Node;
//import java.util.Stack;
//
//public class MinStack {
//    Stack<Integer> Minst;
//    Stack<Integer> Datast;
//    public MinStack() {
//        this.Datast = new Stack<Integer>();
//        this.Minst = new Stack<Integer>();
//        Minst.push(2147483648); /* 压入一个较大值*/
//    }
//
//    public void push(int val) {
//        Datast.push(val);
//        if(Minst.isEmpty()) Minst.push(val);
//        else Minst.push(Math.min(val, Minst.peek()));
//    }
//
//    public void pop() {
//        Datast.pop();
//        Minst.pop();
//    }
//
//    public int top() {
//        return  Datast.peek();
//    }
//
//    public int getMin() {
//        return  Minst.peek();
//    }
//
//    public static void main(String[] args) {
//        MinStack test = new MinStack();
//        test.push(1);
//        test.push(-6);
//        test.push(3);
//        System.out.println(test.getMin());
//    }
//}

