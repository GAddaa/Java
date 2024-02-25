import java.util.stream.Stream;

void main() {
    Stream.<String>builder()
            .add("Aaa")
            .add("Cc")
            .add("Eee")
            .add("B")
            .add("Ddd")
            .build()
            .filter(s -> s.length() >= 3)
            .sorted()
            .limit(2)
            .forEach(System.out::println);
}
