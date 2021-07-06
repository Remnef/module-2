package Solution;

public class Solution {
    static class Node{
        public int data;
        public Node link;
    }

    static class Queue{
        public Node front;
        public Node rear;
    }

    public static void enQueue(Queue queue, int value){
        Node temp = new Node();
        temp.data = value;
        if(queue.front == null){
            queue.front = temp;
        }else{
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }

    public static int deQueue(Queue queue){
        if(queue.front == null){
            System.out.println("Queue is Empty");
            return Integer.parseInt(null);
        }

        int value;
        if(queue.front == queue.rear){
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        }else {
            value = queue.front.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }

        return value;
    }

    public static void  displayQueue(Queue q){
        Node temp = q.front;
        System.out.println("Elements in Queue are:");
        while(temp.link != q.front){
            System.out.println(temp.data + " ");
            temp = temp.link;
        }
        System.out.println(temp .data);
    }

    public static void main(String args[])
    {
        // Create a queue and initialize front and rear
        Queue  q = new Queue();
        q .front = q .rear =  null;

        // Inserting elements in Circular Queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Display elements present in Circular Queue
        displayQueue(q);

        // Deleting elements from Circular Queue
        System.out.printf("Deleted value = %d\n", deQueue(q));
        System.out.printf("Deleted value = %d\n", deQueue(q));

        // Remaining elements in Circular Queue
        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }
}