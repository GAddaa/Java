import java.util.stream.Stream;

void main() {
    fA();
}

void fA() {
    Stream.iterate(0, n -> n + 1)
            .limit(5)
            .forEach(System.out::println);
}
