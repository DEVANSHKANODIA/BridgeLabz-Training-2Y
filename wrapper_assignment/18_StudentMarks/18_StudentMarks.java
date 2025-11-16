public class StudentMarks {
  public static void main(String[] args){
    String[] in={"85","null","95","abc","88"};
    int sum=0,c=0;
    for(String x:in){
      try{
        Integer v=Integer.valueOf(x);
        sum+=v;c++;
      }catch(Exception e){}
    }
    System.out.println(sum/c);
  }
}