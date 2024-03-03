import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

void main() {
    fA();
}

public record Product(String name) { }

void fA() {
    final List<Product> products = Arrays.asList(
            new Product("Potatoes"),
            new Product("Lemon"),
            new Product("Sugar")
    );

    final String listToString = products
            .stream()
            .map(Product::name)
            .collect(Collectors.joining(", ", "[", "]"));

    System.out.println(listToString);
}
