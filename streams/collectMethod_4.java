import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

void main() {
    fA();
}

public record Product(String name, double price) { }

void fA() {
    final List<Product> products = Arrays.asList(
            new Product("Potatoes", 3.45),
            new Product("Lemon", 1.77),
            new Product("Sugar", 7.36)
    );

    final Map<Double, List<Product>> collectorMapOfLists = products
            .stream()
            .collect(Collectors.groupingBy(Product::price));

    collectorMapOfLists.forEach((key, value) -> System.out.println(STR."\{key}: \{value}"));
}
