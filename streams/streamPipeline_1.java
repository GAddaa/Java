import java.util.Arrays;
import java.util.List;

void main() {
    fA();
}

void fA() {
    final List<String> list = Arrays.asList("Aaa", "Bbb", "Ccc");
    System.out.println(list.stream().skip(1).count());
}
