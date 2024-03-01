import java.util.OptionalInt;
import java.util.stream.IntStream;

void main() {
    fA();
    fB();
}

void fA() {
    final OptionalInt sum = IntStream
            .range(0, 10)
            .reduce(Integer::sum);

    sum.ifPresent(System.out::println);
}

void fB() {
    final int sum = IntStream
            .range(0, 10)
            .reduce(10, Integer::sum);

    System.out.println(sum);
}
