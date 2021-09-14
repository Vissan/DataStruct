import org.junit.Test;

import java.util.HashMap;

public class canConstruct {
    /**
     * 哈希表的方式
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean solution(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
        }
        for (int j=0; j<ransomNote.length(); j++) {
            if (!map.containsKey(ransomNote.charAt(j))) {
                return false;
            } else {
                int count = map.get(ransomNote.charAt(j));
                if (count<=0)
                    return false;
                else {
                    count--;
                    map.put(ransomNote.charAt(j), count);
                }
            }
        }
        return true;
    }

    /**
     * 用数组巧妙地构造哈希表
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean solution1(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length())
            return false;
        /**
         * 对应26个英文字母
         */
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
        }
        for (int i : arr) {
            if (i<0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        String s1 = "aa";
        String s2 = "aab";
        canConstruct demo = new canConstruct();
        System.out.println(demo.solution1(s1, s2));
    }
}
