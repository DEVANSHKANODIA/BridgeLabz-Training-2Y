interface PaymentProcessor{default void refund(){System.out.println("Refund processed");}}
class Paytm implements PaymentProcessor{}
public class Main{public static void main(String[]a){new Paytm().refund();}}