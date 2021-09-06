import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {

    public List<List<Integer>> level(TreeNode root) {
        if (root == null)
            return null;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(queue.size()>0) {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for (int i=0; i<size; i++) {
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                if (curr.left!=null) {
                    queue.add(curr.left);
                }
                if (curr.right!=null) {
                    queue.add(curr.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
