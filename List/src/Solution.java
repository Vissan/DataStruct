import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class Solution {
    /**
     * 不需要考虑慢指针，如果没有环的话，快指针一定先停下来
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    /**
     * 合并两个链表并以升序返回一个链表
     * 递归方式实现
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val<l2.val) {
            l1.next = mergeTwoLists_1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_1(l1, l2.next);
            return l2;
        }
    }

    /**
     * 迭代方式实现
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-1);
        ListNode head = newList;
        while (l1!=null&&l2!=null) {
            if (l1.val< l2.val) {
                newList.next = l1;
                l1 = l1.next;
            } else {
                newList.next= l2;
                l2 = l2.next;
            }
            newList = newList.next;
        }
        newList.next = l1 ==null ? l2: l1;
        return head.next;
    }

    /**
     * 移除所有的val值
     * 因为头结点可能会被删除，因此需要添加一个哑结点，节点的下一个节点指向头结点
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = new ListNode(-1);
        curr.next = head;
        ListNode temp = curr;
        while (temp.next!=null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }
        return curr.next;
    }

    /**
     * 反转链表，迭代方式
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * 删除相同的元素，头指针和下个指针都要存在时才有意义
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        while (head!=null) {
            set.add(head.val);
            head = head.next;
        }
        ListNode res = new ListNode(-1);
        for (Integer integer : set) {
            res.val = integer;
            res = res.next;
        }
        return res;
    }
}
