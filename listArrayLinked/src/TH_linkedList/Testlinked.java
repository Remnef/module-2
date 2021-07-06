package TH_linkedList;

import java.util.LinkedList;

public class Testlinked {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        mylinkedList ll = new mylinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();

        LinkedList<String> list = new LinkedList<>();
        list.add("Tran");
        list.add("Loc");
        list.addFirst("Remnef");
//        System.out.println(list);

        for(int p=0; p < list.size(); p++)
        {
            System.out.println("Element at index "+p+": "+list.get(p));
        }


    }
}
