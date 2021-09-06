import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 本题是判断是否有重复的元素
 * 1、 通过java中set集合的方法来进行判断
 * 2、 先将传入的数组排序，然后再两两之间比较
 * 3、 哈希表
 */
public class containsDuplicate {
    public boolean solution(int[] nums) {
// First Method
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        return set.size()<nums.length;

//        Second Method

//        Arrays.sort(nums);
//        for (int i=0; i<nums.length-1; i++ ) {
//            if (nums[i] == nums[i+1]) {
//                return true;
//            }
//        }
//        return false;

//        Third Method
        Set hashSet = new HashSet();
        for (int num : nums) {
            if (hashSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}
