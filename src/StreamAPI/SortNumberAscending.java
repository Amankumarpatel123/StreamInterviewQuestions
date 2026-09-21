package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumberAscending {
    public static void main() {
        List<Integer> numbers = Arrays.asList(45, 12, 8, 33, 45, 21, 8, 60, 9, 33);
        List<Integer> descSortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descSortedNumbers);
    }
}
