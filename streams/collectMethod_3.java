import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

void main() {
    fA();
}

public record Product(String name, double price) { }

void fA() {
    final List<Product> products = Arrays.asList(
            new Product("Potatoes", 3.45),
            new Product("Lemon", 1.77),
            new Product("Sugar", 1.13)
    );

    final DoubleSummaryStatistics summingPrice = products
            .stream()
            .collect(Collectors.summarizingDouble(Product::price));

    System.out.println(summingPrice);
}
