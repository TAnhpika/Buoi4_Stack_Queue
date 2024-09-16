package Queue;

public class MyQueue {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int length;

    public MyQueue() {
        front = null;
        rear = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        // TH1: Queue null: front noi voi node dau tien
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;

        }
        rear = newNode;
        length++;
    }

    // BTVN:
    /*
     * dequeue, pop
     * clone code a ve code tren do
     * leetcode 2 va 19:
     * https://leetcode.com/problemset/all-code-essentials/?topicSlugs=linked-list
     */
    // dequeue:remove and return data removed
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; 
        } else {
            Node temp = front; 
            front = front.next; 

            if (front == null) {
                rear = null;
            }

            length--; 
            return temp.data;
        }
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.getLength());
        System.out.println("Dequeue: " + queue.deQueue());
        System.out.println("Dequeue: " + queue.deQueue());
        System.out.println("Length after deque: "+queue.getLength());

    }
}