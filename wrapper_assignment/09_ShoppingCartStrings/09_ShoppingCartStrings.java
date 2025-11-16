public class ShoppingCartStrings {
  public static void main(String[] args){
    String[] p={"250","499","99","abc"};
    int t=0;
    for(String x:p){
      try{t+=Integer.parseInt(x);}catch(Exception e){}
    }
    System.out.println(t);
  }
}