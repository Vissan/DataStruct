import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class isAnagram {
    /**
     * 模拟哈希表的方式
     * @param s
     * @param t
     * @return
     */
    public boolean solution(String s, String t) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            arr[ch - 'a']--;
        }
        for (int i : arr) {
            if (i!=0)
                return false;
        }
        return true;
    }

    /**
     * 排序后比较字符串是否相等
     * @param s
     * @param t
     * @return
     */
    public boolean solution1(String s, String t) {
        final char[] chars = s.toCharArray();
        final char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return Arrays.equals(chars, chart);
    }

    @Test
    public void test() {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(new isAnagram().solution1(s, t));
    }
}
