import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

void main() {
    final Aaa a = new Aaa();
    final List<String> list = Arrays.asList("abc1", "abc2", "abc3");

    final Stream<String> stream = list
            .stream()
            .filter(element -> {
                a.wasCalled();
                return element.contains("2");
            });

    //stream.forEach(System.out::println);
}

public static class Aaa {
    private void wasCalled() {
        System.out.println("wasCalled()");
    }
}
