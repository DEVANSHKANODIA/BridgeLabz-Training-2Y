public class CircularBuffer {

    int[] arr;
    int size;
    int start;

    public CircularBuffer(int s) {
        arr = new int[s];
        size = 0;
        start = 0;
    }

    public void add(int x) {
        if (size < arr.length) {
            arr[size] = x;
            size++;
        } else {
            arr[start] = x;
            start = (start + 1) % arr.length;
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[(start + i) % arr.length] + " ");
        }
    }

    public static void main(String[] args) {
        CircularBuffer b = new CircularBuffer(3);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.print();
    }
}
