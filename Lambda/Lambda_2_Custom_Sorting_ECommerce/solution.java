import java.util.*;

class Product {
    String name;
    int price;
    double rating;

    Product(String n, int p, double r) {
        name = n; price = p; rating = r;
    }
}

public class SortDemo {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Product("Phone", 50000, 4.5),
                new Product("Laptop", 70000, 4.8),
                new Product("Mouse", 800, 4.2)
        );

        list.sort((a, b) -> a.price - b.price);
        list.sort((a, b) -> Double.compare(b.rating, a.rating));
        list.sort((a, b) -> a.name.compareTo(b.name));
    }
}