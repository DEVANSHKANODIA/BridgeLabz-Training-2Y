public class Maximum {
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T m = a;
        if (b.compareTo(m) > 0) m = b;
        if (c.compareTo(m) > 0) m = c;
        return m;
    }
    public static void main(String[] args) {
        System.out.println(max(3,7,4));
    }
}