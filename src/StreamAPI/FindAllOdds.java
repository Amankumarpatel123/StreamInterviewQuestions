package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllOdds {
    static void main() {
        List<Integer> numbers = Arrays.asList(45, 12, 8, 33, 45, 21, 8, 60, 9, 33);

        List<Integer> odds = numbers.stream()
                .filter(num-> num % 2 !=0)
                .collect(Collectors.toList());
        System.out.println(odds);
    }
}
