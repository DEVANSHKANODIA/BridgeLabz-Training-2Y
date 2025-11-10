interface Payment{void pay(double amt);}
class UPI implements Payment{public void pay(double amt){System.out.println("Paid via UPI "+amt);}}
public class Main{public static void main(String[]a){Payment p=new UPI();p.pay(100);}}