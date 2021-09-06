import java.util.HashMap;
import java.util.LinkedList;

public class twoSum {
    public int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int num : nums) {
            map.put(i, num);
            i++;
        }
        for (Integer value : map.values()) {
            if (map.containsValue(target-value)) {
                return new int[]{map.get(value), map.get(target-value)};
            }
        }
        return new int[0];
    }
}
