import java.util.Arrays;
import java.util.LinkedList;

public class merge {
    public void Solution(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        LinkedList list = new LinkedList();
        list.clear();
    }
}
