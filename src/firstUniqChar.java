import org.junit.Assert;
import org.junit.Test;

import java.net.IDN;
import java.util.HashMap;

public class firstUniqChar {
    public int solution(String s) {
        char[] ss = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : ss) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int index, result = -1;
        for (index=0; index<ss.length; index++) {
            if (map.get(ss[index]) == 1) {
                result = index;
                break;
            }
        }
        return result;
    }

    @Test
    public void test() {
        String s = "aacc";
        firstUniqChar demo = new firstUniqChar();
        System.out.println(demo.solution(s));
    }
}
