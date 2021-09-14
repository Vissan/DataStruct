import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findLongestWord {
    public String solution(String s, List<String> dictionary) {
        dictionary.sort((a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b);
        });
        int s_len = s.length();
        for (String ss : dictionary) {
            int ss_len = ss.length();
            int i = 0;
            int j = 0;
            while (i<s_len&&j<ss_len) {
                if (s.charAt(i) == ss.charAt(j)) {
                    j++;
                }
                i++;
            }
            if (j == ss_len)
                return ss;
        }
        return "";
    }

}
