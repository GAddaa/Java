import java.util.regex.Pattern;

void main() {
    fA();
    fB();
}

void fA() {
    "abc".chars()
            .forEach(System.out::println);
}

void fB() {
    Pattern.compile(", ")
            .splitAsStream("a, b, c")
            .forEach(System.out::println);
}
