import java.util.ArrayList;
import java.util.List;

public class backOrder {
    public List<Integer> solution(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        backSolution(root, result);
        return result;
    }

    public void backSolution(TreeNode root, List<Integer> res) {
        if (root == null)
            return;
        backSolution(root.left, res);
        backSolution(root.right, res);
        res.add(root.val);
    }
}
