package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
public class NamesWithLengthGreaterThanGiven {
    static void main() {
        List<String> names = Arrays.asList("Anil", "Bob", "Amit", "Rakesh", "Anki");
        List<String> requiredString = names.stream()
                .filter(str -> str.length()-1 > 4 )
                .collect(Collectors.toList());
        System.out.println(requiredString);


    }
}
