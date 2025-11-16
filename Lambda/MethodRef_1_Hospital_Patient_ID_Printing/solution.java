import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<Integer> patientIds = Arrays.asList(101, 203, 330, 450);
        patientIds.forEach(System.out::println);
    }
}