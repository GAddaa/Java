import java.util.Arrays;
import java.util.List;

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

    final List<String> result = products
            .stream()
            .map(Product::name)
            .toList();

    result.forEach(System.out::println);
}
