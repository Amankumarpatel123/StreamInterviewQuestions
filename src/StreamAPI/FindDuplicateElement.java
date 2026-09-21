package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindDuplicateElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(3,2,4,7,55,55,5,87,45,67,67,2,34,1);
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicate = numbers.stream()
                .filter( num -> !seen.add(num))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicate);
    }
}
