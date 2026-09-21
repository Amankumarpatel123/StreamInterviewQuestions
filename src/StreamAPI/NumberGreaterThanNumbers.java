package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGreaterThanNumbers {
    static void main() {
        List<Integer> numbers = Arrays.asList(2,3,5,5,4,33,37,45,3,6);
        List<Integer> greater = numbers.stream()
                .filter(num-> num> 20)
                .collect(Collectors.toList());
        System.out.println(greater);
    }
}
