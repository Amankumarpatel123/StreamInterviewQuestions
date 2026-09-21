package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyNumberGreaterThanGivenNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,4,5,43,3,5,76,67);
        Boolean anyGreater = numbers.stream()
                .anyMatch(num-> num > 50);
        System.out.println(anyGreater);
    }
}
