package Stack;

public class MyStack {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1 2 3 4 5
    private Node top; // top = 5
    private int length;

    public MyStack() {
        top = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    // pop: remove and return data removed
    public int pop() {
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        else{
            Node temp = top; 
            top = top.next;
            length--;
            return temp.data;
        }    
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(10);
        stack.push(12);
        System.out.println(stack.length);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Length after pop: "+stack.length);


    }
}
