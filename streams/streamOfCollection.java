import java.util.Arrays;
import java.util.Collection;

void main() {
    final Collection<String> collection = Arrays.asList("Ccc", "Bbb", "Aaa");

    collection.stream().sorted().forEach(System.out::println);
}
