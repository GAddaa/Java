import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

void main() {
    fA();
}

void fA() {
    try (final Stream<String> streamOfStrings =
                 Files.lines(Paths.get("C://Users//pandi//Desktop//Java//streams//a.txt"), StandardCharsets.UTF_8)) {
        streamOfStrings.forEach(System.out::println);
    } catch (IOException ioException) {
        throw new RuntimeException(ioException);
    }
}
