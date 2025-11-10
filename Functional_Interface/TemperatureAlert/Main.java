import java.util.function.Predicate;
public class Main{public static void main(String[]a){Predicate<Double> alert=t->t>50;System.out.println(alert.test(60.0));}}