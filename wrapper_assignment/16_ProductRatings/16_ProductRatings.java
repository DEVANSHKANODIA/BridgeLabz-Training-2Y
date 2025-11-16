import java.util.*;
public class ProductRatings {
  public static void main(String[] args){
    int[] a={4,5,3};
    ArrayList<Integer> b=new ArrayList<>();
    b.add(5);b.add(null);b.add(4);
    ArrayList<Integer> all=new ArrayList<>();
    for(int x:a)all.add(x);
    for(Integer x:b)if(x!=null)all.add(x);
    double sum=0;int c=0;
    for(Integer x:all){sum+=x;c++;}
    System.out.println(sum/c);
  }
}