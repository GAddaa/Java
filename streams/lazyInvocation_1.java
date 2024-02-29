import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

void main() {
    fA();
}

void fA() {
    final List<String> list = Arrays.asList("Aaa", "Bbb", "Ccc");
    final Optional<String> stream = list
            .stream()
            .filter(element -> {
                System.out.println("filter()");
                return element.contains("c");
            })
            .map(element -> {
                System.out.println("map()");
                return element.toUpperCase(Locale.ROOT);
            })
            .findFirst();

    stream.ifPresent(System.out::println);
}
