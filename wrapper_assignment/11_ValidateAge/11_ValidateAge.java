public class ValidateAge {
  public static boolean check(String s){
    try{
      int x=Integer.parseInt(s);
      return x>=18;
    }catch(Exception e){return false;}
  }
  public static void main(String[] args){
    System.out.println(check("20"));
    System.out.println(check("abc"));
  }
}