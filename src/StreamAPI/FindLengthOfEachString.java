package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLengthOfEachString {
    public static void main() {
        List<String> names = Arrays.asList("Anil", "Bob", "Amit", "Rakesh", "Anki");
        List<Integer> stringLength = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(stringLength);
    }
}
