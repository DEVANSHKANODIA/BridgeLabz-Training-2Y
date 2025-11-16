import java.util.*;
public class EmployeeAges {
  public static void main(String[] args){
    int[] a={22,35,28,40,19};
    ArrayList<Integer> l=new ArrayList<>();
    for(int x:a)l.add(x);
    System.out.println(Collections.min(l));
    System.out.println(Collections.max(l));
  }
}