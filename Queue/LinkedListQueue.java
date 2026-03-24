package Queue;

public class LinkedListQueue {
    private Node front;
    private Node rear;

    public void q(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return removed;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.q(10);
        q.q(20);
        q.q(30);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        System.out.print("Queue after dequeue: ");
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}