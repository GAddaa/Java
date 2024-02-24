import java.util.List;
import java.util.stream.Stream;

void main() {
    final List<String> list = List.of("Aaa", "Bbb", "Ccc");

    streamOf(list).forEach(System.out::println);
}

Stream<String> streamOf(final List<String> list) {
    return null == list || list.isEmpty()
            ? Stream.empty()
            : list.stream();
}
