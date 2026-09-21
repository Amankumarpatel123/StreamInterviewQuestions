package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllStringToUpperCase {
    public static void main() {
        List<String> names = Arrays.asList("Anil", "Bob", "Amit", "Rakesh", "Anki");
        List<String> upperCase = names.stream()
                .map((String:: toUpperCase))
                .collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
