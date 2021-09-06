public class SinglyListNode {
    public int val;
    public SinglyListNode next;//指向上一个节点
    public SinglyListNode prev;//指向下一个节点

    public SinglyListNode(int val) {
        this.val = val;
    }

    public SinglyListNode(int val, SinglyListNode node) {
        this.val = val;
        this.next = node;
    }
}
