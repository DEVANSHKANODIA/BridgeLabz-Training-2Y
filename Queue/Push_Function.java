package Queue;

public class Push_Function {
    int[] queue = new int[10];
    int rear = -1;
    int front = -1;

    public void push(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = value;
        System.out.println(value + " inserted into queue");
    }
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}