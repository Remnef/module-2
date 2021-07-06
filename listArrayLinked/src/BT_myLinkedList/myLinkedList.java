package BT_myLinkedList;

public class myLinkedList {
    private Node head;
    private int numNodes;
    public myLinkedList(){

    }
    public myLinkedList(Object data){
        head = new Node(data);
    }

    class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public  void add(int index, Object data){
        Node temp = head;
        Node holder;
        for(int i=0; i<index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void remove(int index){
        Node temp = head;
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public void remove (Object o){
        Node temp = head;
        while (temp.next.data != o){
            temp =temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public Node get(int index){
        Node temp=head;
        for (int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int size(){
        return numNodes;
    }

    public void printList(){
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public myLinkedList clone(){
        Node Temp = head.next;
        myLinkedList temp = new myLinkedList(head.data);
        while (Temp != null){
            temp.addLast(Temp.data);
            Temp=Temp.next;
        }
        return temp;
    }


}
