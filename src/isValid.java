import org.junit.Test;

import javax.accessibility.AccessibleHyperlink;
import java.util.Stack;

public class isValid {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        final char[] chars = s.toCharArray();
        char c;
        for (char aChar : chars) {
            c = aChar;
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid demo = new isValid();
        String s = "(]";
        System.out.println(demo.solution(s));
    }
}
