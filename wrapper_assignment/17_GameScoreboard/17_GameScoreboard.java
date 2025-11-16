public class GameScoreboard {
  public static void main(String[] args){
    Integer[] s={10,null,20,null,15};
    int np=0;int sum=0;
    for(Integer x:s){
      if(x==null)np++;
      else sum+=x;
    }
    System.out.println(np);
    System.out.println(sum);
  }
}