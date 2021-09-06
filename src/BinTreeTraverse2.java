import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能：把一个数组的值存入二叉树中，然后进行3种方式的遍历
 *
 * 参考资料0:数据结构(C语言版)严蔚敏
 *
 * 参考资料1：http://zhidao.baidu.com/question/81938912.html
 *
 * 参考资料2：http://cslibrary.stanford.edu/110/BinaryTrees.html#java
 *
 * @author ocaicai@yeah.net @date: 2011-5-17
 *
 */
public class BinTreeTraverse2 {

    private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private static List<Node> nodeList = null;

    /**
     * 内部类：节点
     *
     * @author ocaicai@yeah.net @date: 2011-5-17
     *
     */
    private static class Node {
        Node leftChild;
        Node rightChild;
        int data;

        Node(int newData) {
            leftChild = null;
            rightChild = null;
            data = newData;
        }
    }

    public void createBinTree() {
        nodeList = new ArrayList<Node>();
        //将数组的值依次转换为节点里的值
        for (int j : array) {
            nodeList.add(new Node(j));
        }
        // 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树
        for(int parentindex=0;parentindex<=array.length/2-1;parentindex++){
            nodeList.get(parentindex).leftChild = nodeList.get(2*parentindex+1);
            nodeList.get(parentindex).rightChild = nodeList.get(2*parentindex+2);
        }
        //判断是否有lastparent-1的右节点，若为奇数则有，否则无
        int lastParent = array.length/2-1;
        nodeList.get(lastParent).leftChild = nodeList.get(lastParent);
        //判断是否有右节点
        if(array.length%2 != 0){
            nodeList.get(lastParent).rightChild = nodeList.get(lastParent);
        }
    }

    /**
     * 先序遍历
     *
     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
     *
     * @param node
     *            遍历的节点
     */
    public static void preOrderTraverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }

    /**
     * 中序遍历
     *
     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
     *
     * @param node
     *            遍历的节点
     */
    public static void inOrderTraverse(Node node) {
        if (node == null)
            return;
        inOrderTraverse(node.leftChild);
        System.out.print(node.data + " ");
        inOrderTraverse(node.rightChild);
    }

    /**
     * 后序遍历
     *
     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
     *
     * @param node
     *            遍历的节点
     */
    public static void postOrderTraverse(Node node) {
        if (node == null)
            return;
        postOrderTraverse(node.leftChild);
        postOrderTraverse(node.rightChild);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinTreeTraverse2 binTree = new BinTreeTraverse2();
        binTree.createBinTree();
        // nodeList中第0个索引处的值即为根节点
        Node root = nodeList.get(0);

        System.out.println("先序遍历：");
        preOrderTraverse(root);
        System.out.println();

        System.out.println("中序遍历：");
        inOrderTraverse(root);
        System.out.println();

        System.out.println("后序遍历：");
        postOrderTraverse(root);
    }

}
