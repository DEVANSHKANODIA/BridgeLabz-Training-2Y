import java.util.*;

public class CheckSubset {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> b = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean res = b.containsAll(a);

        System.out.println(res);
    }
}
