package pta;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class interSect {
    /**
     * hashmap的方式，时间和空间复杂度较好
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] solution(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length)
            return solution(nums2, nums1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int count = map.getOrDefault(i, 0)+1;
            map.put(i, count);
        }
        int[] result = new int[nums1.length];
        int index = 0;
        for (int j : nums2) {
            int temp = map.getOrDefault(j, 0);
            if (temp>0) {
                result[index++] = j;
                temp--;
                if (temp>=0)
                    map.put(j, temp);
            }

        }
        return Arrays.copyOfRange(result, 0, index);
    }

    @Test
    public void test() {
        int[] num1 = {1,2,4,6,7};
        int[] num2 = {1,2,4,6,6};
        interSect test = new interSect();
        System.out.println(Arrays.toString(test.solution2(num1, num2)));
    }

    /**
     * 双指针的方法
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] solution2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j= 0;
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int index = 0;
        while (i < nums1.length&&j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[index++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i]>nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
