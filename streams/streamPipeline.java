import java.util.Locale;
import java.util.stream.Stream;

void main() {
    fA();
    fB();
}

void fA() {
    Stream
            .of("Aaa", "Bbb", "Ccc")
            .skip(1)
            .forEach(System.out::println);
}

void fB() {
    Stream
            .of("Zzzz", "Aaaa", "Bbbb", "Cccc")
            .skip(2)
            .map(element -> element.toUpperCase(Locale.ROOT))
            .forEach(System.out::println);
}
