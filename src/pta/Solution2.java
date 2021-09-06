package pta;

public class Solution2 {
    public int rob(int[] nums) {

        if (nums.length==1) {
            return nums[0];
        }
        else if (nums.length==2) {
            return Math.max(nums[0], nums[1]);
        }
        else if (nums.length==3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }
        return Math.max(robRange(nums, 0, nums.length-2), robRange(nums, 1, nums.length-1));
    }

    public int robRange(int[] a, int start, int end) {
        int first = a[start];
        int second = Math.max(a[start], a[start+1]);
        for(int i = start+2; i<=end; i++) {
            int temp = second;
            second = Math.max(first + a[i], second);
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        Solution2 test = new Solution2();
        int[] a = {1, 3, 1, 3, 100};
        System.out.println(test.rob(a));
    }
}
