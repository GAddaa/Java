import java.util.Arrays;

void main() {
    fA();
}

void fA() {
    Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
            .parallelStream()
            .reduce(Integer::sum)
            .ifPresent(System.out::println);
}
