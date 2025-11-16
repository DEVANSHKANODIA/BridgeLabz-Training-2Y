public class BankLimit {
  public static double remain(Double limit,double used){
    if(limit==null)return 0.0;
    return limit-used;
  }
  public static void main(String[] args){
    System.out.println(remain(5000.0,1200));
    System.out.println(remain(null,500));
  }
}