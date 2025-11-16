public class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
    public static void main(String[] args) {
        Box<Integer> a = new Box<>();
        a.set(10);
        System.out.println(a.get());
    }
}