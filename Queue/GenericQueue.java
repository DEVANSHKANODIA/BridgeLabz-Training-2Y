package Queue;

public class GenericQueue<T> {
    private T[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;
    @SuppressWarnings("unchecked")
    public GenericQueue(int size) {
        this.capacity = size;
        this.arr = (T[]) new Object[size];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }
    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        currentSize++;
    }

    // Dequeue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return null;
        }
        T item = arr[front];
        arr[front] = null;

        front = (front + 1) % capacity;
        currentSize--;
        return item;
    }

    public T peek() {
        return isEmpty() ? null : arr[front];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == capacity;
    }

    public int size() {
        return currentSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < currentSize; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    // ✅ MAIN METHOD (Testing everything)
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());
        queue.display();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70); // overflow

        queue.display();

        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.dequeue());
        }

        queue.display();
    }
}