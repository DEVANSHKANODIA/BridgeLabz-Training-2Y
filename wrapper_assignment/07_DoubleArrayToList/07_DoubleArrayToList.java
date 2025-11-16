import java.util.*;
public class DoubleArrayToList {
  public static void main(String[] args){
    double[] p={10.5,20.0,35.75,5.5};
    ArrayList<Double> a=new ArrayList<>();
    for(double x:p)a.add(x);
    double max=Collections.max(a);
    double sum=0;
    for(double x:a)sum+=x;
    double avg=sum/a.size();
    System.out.println(max);
    System.out.println(avg);
  }
}