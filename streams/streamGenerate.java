import java.util.stream.Stream;

void main() {
    Stream.generate(() -> "Aaa")
            .limit(10)
            .forEach(System.out::println);
}
