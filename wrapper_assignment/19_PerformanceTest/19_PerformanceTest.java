public class PerformanceTest {
  public static void main(String[] args){
    int n=1000000;
    int[] a=new int[n];
    for(int i=0;i<n;i++)a[i]=i;
    long t1=System.currentTimeMillis();
    long s1=0;
    for(int x:a)s1+=x;
    long t2=System.currentTimeMillis();

    java.util.ArrayList<Integer> b=new java.util.ArrayList<>();
    for(int i=0;i<n;i++)b.add(i);
    long t3=System.currentTimeMillis();
    long s2=0;
    for(int x:b)s2+=x;
    long t4=System.currentTimeMillis();

    System.out.println(t2-t1);
    System.out.println(t4-t3);
  }
}