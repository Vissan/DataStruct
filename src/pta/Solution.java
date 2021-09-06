package pta;

//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (hashtable.containsKey(target - nums[i])) {
//                return new int[]{hashtable.get(target - nums[i]), i};
//            }
//            hashtable.put(nums[i], i);
//        }
//        return new int[0];
//
//    }
//
//    public static void main(String[] args) {
//        Solution test = new Solution();
//        int[] num = {2, 7, 11, 15};
//        int[] a = test.twoSum(num, 18);
//        for (int i : a) {
//            System.out.println(i);
//        }
//    }
//}



//class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//
//
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head = null, tail = null;
//        int carry = 0;
//        while (l1 != null || l2 != null) {
//            int n1 = l1 != null ? l1.val : 0;
//            int n2 = l2 != null ? l2.val : 0;
//            int sum = n1 + n2 + carry;
//            if (head == null) {
//                head = tail = new ListNode(sum % 10);
//            }
//            else {
//                tail.next = new ListNode(sum % 10);
//                tail = tail.next;
//            }
//            carry = sum / 10;
//            if (l1 != null) {
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                l2 = l2.next;
//            }
//        }
//        if (carry > 0) {
//            tail.next = new ListNode(carry);
//        }
//        return head;
//    }
//}

//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int n = nums.length;
//        if(n<2)
//            return n;
//        int slow = 2;
//        for(int fast = 2;fast<n;){
//            if(nums[slow-2] != nums[fast]){
//                nums[slow] = nums[fast];
//                slow++;
//            }
//            fast++;
//        }
//        return slow;
//    }
//
//    public static void main(String[] args) {
//        int[] num = {1,1,1,2,2,2,3,3,3,6,6};
//        Solution test = new Solution();
//        int len = test.removeDuplicates(num);
//        for(int i=0;i<len;i++){
//            System.out.print(num[i]+" ");
//        }
//    }
//}

//import java.util.Arrays;

//import static java.util.Arrays.*;

//class Solution {
//    public boolean search(int[] nums, int target) {
//        int high = nums.length-1;
//        int low = 0;
//        sort(nums);
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(target == nums[mid]){
//                return true;
//            }
//            else if(target>nums[mid]){
//                low = mid+1;
//            }
//            else {
//                high = mid-1;
//            }
//        }
//        return false;
//    }
//}

//import java.util.ArrayList;
//import java.util.List;

//class Solution {
//    public List<Integer> countSmaller(int[] nums) {
//        List<Integer> ret = new ArrayList<>();
//        int len = nums.length;
//        for(int i=0;i<len-1;i++){
//            int count = 0;
//            for(int j=i+1;j<=len-1;j++){
//                if(nums[i]>nums[j]){
//                    count++;
//                }
//            }
//            ret.add(count);
//        }
//        ret.add(0);
//        return ret;
//    }
//
//    public static void main(String[] args) {
//        Solution test = new Solution();
//        int[] nums={6, 4, 3, 2, 1, 5, 7, 9};
//        List a = test.countSmaller(nums);
//        for (Object num : a) {
//            System.out.print(num+ " ");
//        }
//    }
//}


import sun.plugin2.ipc.IPCFactory;

import java.util.*;

//class Solution {
//    public boolean isUgly(int n) {
//        if(n==1) {
//            return true;
//        }
//        else if(n==0) {
//            return false;
//        }
//        else {
//            if(n%2==0) return isUgly(n/2);
//            if(n%3==0) return isUgly(n/3);
//            if(n%5==0) return isUgly(n/5);
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Solution test = new Solution();
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if(test.isUgly(n)) {
//            System.out.println("its true!");
//        }
//        else {
//            System.out.println("its false!");
//        }
//    }
//}

class Solution {
    public int nthUglyNumber(int n) {
        int[] arg = {2, 3, 5};
        Set<Long> set = new HashSet<Long>();
        Queue<Long> queue = new PriorityQueue<Long>();
        int ret = 0;
        set.add(1L);
        queue.offer(1L);
        for(int i=0;i<n;i++) {
            long getvalue = queue.poll();
            ret = (int)getvalue;
            for (int i1 : arg) {
                long next = i1*getvalue;
                if(set.add(next)){
                    queue.offer(next);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.nthUglyNumber(10));

    }
}



