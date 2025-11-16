import java.util.*;
public class NumericSum {
    public static double sum(List<? extends Number> list){
        double s = 0;
        for(Number n:list) s += n.doubleValue();
        return s;
    }
    public static void main(String[] args){
        System.out.println(sum(Arrays.asList(1,2,3)));
    }
}