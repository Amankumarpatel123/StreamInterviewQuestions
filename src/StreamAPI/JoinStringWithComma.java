package StreamAPI;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class JoinStringWithComma {
    public static void main() {
            List<String> names = Arrays.asList("Anil", "Bob", "Amit", "Rakesh", "Anki");
            String namesWithComma = names.stream()
                    .collect(Collectors.joining(", "));
        System.out.println(namesWithComma);
    }
}
