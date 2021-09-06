import java.util.LinkedList;
import java.util.Queue;

public class maxDepth {
    public int solution(TreeNode root) {
        if (root==null)
            return 0;
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size()>0) {
            int size = queue.size();
            for (int i=0; i<size ;i++) {
                TreeNode curr = queue.poll();
                if (curr.left!=null)
                    queue.add(curr.left);
                if (curr.right!=null)
                    queue.add(curr.right);
            }
            result++;
        }
        return result;
    }
}
