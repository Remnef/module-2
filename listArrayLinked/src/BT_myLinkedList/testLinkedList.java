package BT_myLinkedList;

public class testLinkedList {
    public static void main(String[] args) {
        myLinkedList test1 = new myLinkedList("Info :");
        test1.addLast("Tran");
        test1.addLast("Loc");
        test1.addLast("đẹp trai");
        test1.printList();
        myLinkedList test2 = test1.clone();
        test2.printList();

    }
}
