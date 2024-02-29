import java.util.Arrays;
import java.util.List;

void main() {
    fA();
}

void fA() {
    final List<String> list = Arrays.asList("Aaa", "Bbb", "Ccc", "Ddd", "Eee", "Fff");

    final long size = list
            .stream()
            .skip(4)
            .count();

    System.out.println(size);
}
