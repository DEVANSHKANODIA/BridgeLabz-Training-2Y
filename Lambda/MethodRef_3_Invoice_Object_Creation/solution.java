import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    int transactionId;
    Invoice(int id) { this.transactionId = id; }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<Integer> txIds = Arrays.asList(11, 22, 33, 44);

        List<Invoice> invoices = txIds.stream()
                                      .map(Invoice::new)
                                      .collect(Collectors.toList());
    }
}