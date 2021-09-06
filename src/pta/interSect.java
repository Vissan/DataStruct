package pta;

import java.util.Arrays;
import java.util.LinkedList;

public class interSect {
    public int[] solution(int[] nums1, int[] nums2) {
        int len = Math.max(nums1.length, nums2.length);
        int[] res = new int[len];
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i : nums1) {
            list1.add(i);
        }
        for (int i: nums2) {
            list2.add(i);
        }

        for (Integer integer : list1) {
            if (list2.contains(integer)) {
                res = Arrays.copyOf(res, res.length+1);
                res[res.length-1] = integer;
                list1.remove(integer);
                list2.remove(integer);
            }
        }
        return res;
    }

}
