import java.util.Random;
import java.util.stream.IntStream;

void main() {
    fA();
    fB();
    fC();
}

void fA() {
    System.out.println("fA()");
    final IntStream intStream = IntStream.range(0, 3);
    intStream.forEach(System.out::println);
}

void fB() {
    System.out.println("fB()");
    IntStream.rangeClosed(0, 3).forEach(System.out::println);
}

void fC() {
    System.out.println("fC()");
    new Random().doubles(5).sorted().forEach(System.out::println);
}
