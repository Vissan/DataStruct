import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class StackTest {
    public boolean isValid(@NotNull String s) {
        if(s.length()%2==0) {
            Stack<Character> st = new Stack<Character>();
            for(int i=0;i<s.length();i++) {
                char temp = s.charAt(i);
                if(temp=='('||temp=='{'||temp=='[')
                    st.push(temp);
                else if(temp==')') {
                    if(!st.isEmpty()&&st.peek()=='(') st.pop();
                    else return false;
                }
                else if(temp=='}') {
                    if(!st.isEmpty()&&st.peek()=='{') st.pop();
                    else return false;
                }
                else {
                    if(!st.isEmpty()&&st.peek()=='[') st.pop();
                    else return false;
                }
            }
            return st.isEmpty();
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "))";
        StackTest test = new StackTest();
        System.out.println(test.isValid(s));
    }
}
