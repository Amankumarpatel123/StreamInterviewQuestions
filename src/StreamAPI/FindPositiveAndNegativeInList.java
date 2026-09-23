package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindPositiveAndNegativeInList {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,3,-4,-5,-6);
        Map<Boolean,List<Integer>> number = numbers.stream()
                .collect(Collectors.partitioningBy(num-> num > 0));
        List<Integer> positive = number.get(true);
        List<Integer> neagative = number.get(false);

        System.out.println(positive);
        System.out.println(neagative);
    }
}
