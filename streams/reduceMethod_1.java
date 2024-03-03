import java.util.stream.Stream;

void main() {
    fA(); // 16
    fB(); // 36
}

void fA() {
    int sum = Stream
            .of(1, 2, 3)
            .reduce(10, Integer::sum);

    System.out.println(sum);
}

void fB() {
    int sum = Stream
            .of(1, 2, 3)
            .parallel()
            .reduce(10, Integer::sum);

    System.out.println(sum);
}
