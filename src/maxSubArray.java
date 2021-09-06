import org.junit.Test;

import java.util.Arrays;

public class maxSubArray {
    public int solution(int[] nums) {
        int pre = 0;
        int maxNums = nums[0];
        for (int num : nums) {
            pre = Math.max(num, pre+num);
            maxNums = Math.max(pre, maxNums);
        }
        return maxNums;
    }

    @Test
    public void test() {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new maxSubArray().solution(num));
    }
}
