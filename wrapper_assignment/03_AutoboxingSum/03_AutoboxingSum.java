import java.util.*;
public class AutoboxingSum {
  public static void main(String[] args){
    ArrayList<Integer> a=new ArrayList<>();
    a.add(10);a.add(20);a.add(5);a.add(15);a.add(5);
    int s=0;
    for(int x:a)s+=x;
    System.out.println("Sum of numbers = "+s);
  }
}