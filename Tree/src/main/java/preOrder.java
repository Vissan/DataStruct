import java.util.ArrayList;
import java.util.List;

public class preOrder {

    public List<Integer> solution(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preSolution(root, result);
        return result;
    }

    public void preSolution(TreeNode root, List<Integer> res) {
        if (root == null)
            return;
        res.add(root.val);
        preSolution(root.left, res);
        preSolution(root.right, res);
    }
}

