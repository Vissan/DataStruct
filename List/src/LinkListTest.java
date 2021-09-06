public class LinkListTest {
    public static void main(String[] args) {
        MySinglyList list = new MySinglyList();
        list.addAtIndex(20, 20);
        list.addAtIndex(-11, -11);
        list.addAtIndex(2, 30);
        list.printList();
        list.clearList();
        list.printList();
    }
}
