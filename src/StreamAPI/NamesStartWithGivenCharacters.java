package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NamesStartWithGivenCharacters {
    static void main() {
        List<String> names = Arrays.asList("Anil", "Bob", "Amit", "Rakesh", "Anki");
        List<String> startWithA = names.stream()
                .filter(str -> str.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(startWithA);
    }
}
