package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(3,4,7,5,87,45,67,2,34,1);
        int secondMax = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(secondMax);

    }
}
