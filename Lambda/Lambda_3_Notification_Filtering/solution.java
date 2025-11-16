import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "High BP Alert",
            "Low Sugar Alert",
            "General Checkup Reminder",
            "Critical Heart Alert"
        );

        Predicate<String> criticalOnly = alert -> alert.contains("Critical");

        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);
    }
}