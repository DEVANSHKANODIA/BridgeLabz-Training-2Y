import java.util.function.Function;
public class Main{public static void main(String[]a){Function<String,Integer> f=s->s.length();System.out.println(f.apply("hello"));}}