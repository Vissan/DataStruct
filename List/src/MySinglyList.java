public class MySinglyList {

    int size;
    SinglyListNode head;
    SinglyListNode tail;

    public MySinglyList() {
        size = 0;
        head = new SinglyListNode(0);
        tail = new SinglyListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        if (index<0||index>size) {
            return -1;
        }
        SinglyListNode curr = head;
        for (int i=0;i<index-1; i++) {
            curr = curr.next;
        }
        return curr.next.val;
    }

    /**
     * 头插法
     * 设定两个临时节点用于指代头结点和首节点
     * @param val
     */
    public void addHeadNode(int val) {
        SinglyListNode prev = head;
        SinglyListNode back = head.next;

        SinglyListNode addHead = new SinglyListNode(val);
        prev.next = addHead;
        addHead.prev = prev;
        addHead.next = back;
        back.prev = addHead;
        size++;
    }

    /**
     * 尾插法
     * 与头插法类似
     * @param val
     */
    public void addTailNode(int val) {
        SinglyListNode temp = tail;
        SinglyListNode prev = tail.prev;

        SinglyListNode newNode = new SinglyListNode(val);
        newNode.next = temp;
        temp.prev = newNode;
        prev.next = newNode;
        newNode.prev = prev;
        size++;
    }

    /**
     * 添加到指定的位置，如果大于链表的大小则添加到尾节点的前面，小于0则添加到头结点的后面
     * @param index
     * @param val
     */
    public void addAtIndex(int index, int val) {
        if (index<=0)
            addHeadNode(val);
        else if (index>=size)
            addTailNode(val);
        else {
            SinglyListNode newNode = new SinglyListNode(val);
            SinglyListNode curr = head;
            for (int i=0;i<index-1;i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }

    /**
     * 删除指定位置的值
     * @param index
     */
    public void deleteAtIndex(int index) {
        if (index<0||index>=size)
            return;

        SinglyListNode curr = head;
        for (int i=0;i<index-1;i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    /**
     * 打印链表，注意从头结点的下一个节点开始遍历链表
     */
    public void printList() {
        SinglyListNode temp = head.next;
        for (int i=0;i<size;i++) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    /**
     * 编辑指定位置的值，需要考虑指定位置是否存在的问题
     * @param index
     * @param val
     */
    public void editList(int index, int val) {
        if (index<0||index>=size)
            return;

        SinglyListNode curr = head;
        for (int i=0;i<index-1;i++) {
            curr = curr.next;
        }

        curr.next.val = val;
    }

    /**
     * 清除链表中的元素
     */
    public void clearList() {
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
}
