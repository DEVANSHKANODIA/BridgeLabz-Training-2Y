import java.util.*;
public class CopyList {
    public static void copy(List<? super Number> d, List<? extends Number> s){
        for(Number n:s) d.add(n);
    }
    public static void main(String[] args){
        List<Number> d = new ArrayList<>();
        List<Integer> s = Arrays.asList(1,2,3);
        copy(d,s);
        System.out.println(d);
    }
}