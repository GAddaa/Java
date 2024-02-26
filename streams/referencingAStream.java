import java.util.List;
import java.util.stream.Stream;

void main() {
    fA();
    fB();
}

void fA() {
    final Stream<String> stream = Stream
            .of("Aaa", "Bbb", "Ccc")
            .filter(element -> element.contains("Bbb"));

    stream.forEach(System.out::println);
}

void fB() {
    final List<String> elements = Stream
            .of("Ddd", "Eee", "Fff")
            .filter(element -> element.contains("Fff"))
            .toList();

    elements
            .stream()
            .findAny()
            .ifPresent(System.out::println);

    elements
            .stream()
            .findFirst()
            .ifPresent(System.out::println);
}
