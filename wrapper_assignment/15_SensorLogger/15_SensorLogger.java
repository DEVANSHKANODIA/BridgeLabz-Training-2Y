public class SensorLogger {
  public static void log(Double d){
    System.out.println(d);
  }
  public static void log(double d){
    System.out.println(d);
  }
  public static void main(String[] args){
    double a=25.6;
    Double b=30.5;
    log(a);
    log(b);
  }
}