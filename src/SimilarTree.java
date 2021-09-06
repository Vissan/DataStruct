import java.util.ArrayList;
import java.util.List;

public class SimilarTree {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        dfs(root1, list1);
        dfs(root2, list2);
        return list1.equals(list2);
    }
    public void dfs(TreeNode root, List<Integer> val) {
        if(root.left==null&&root.right==null) {
            val.add(root.val);
        }
        if(root.right!=null) {
            dfs(root.right, val);
        }
        if(root.left!=null) {
            dfs(root.left, val);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
