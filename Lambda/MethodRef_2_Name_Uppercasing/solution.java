import java.util.*;

public class UpperDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("devansh", "rahul", "sanya");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}