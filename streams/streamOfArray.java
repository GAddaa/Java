import java.util.Arrays;
import java.util.stream.Stream;

void main() {
    fA();
    fB();
}

void fA() {
    final Stream<String> streamOfArray = Stream.of("A", "B", "C", "D", "C", "A");

    streamOfArray.distinct().forEach(System.out::println);
}

void fB() {
    final String[] array = new String[] { "a", "b", "c" };

    Arrays.stream(array).forEach(System.out::println);
    Arrays.stream(array, 1, 3).forEach(System.out::println);
}
