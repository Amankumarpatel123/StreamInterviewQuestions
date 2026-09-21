package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class ThirdHighestnumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(3,2,4,7,55,55,5,87,45,67,67,2,34,1);
        int thirdHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow();
        System.out.println(thirdHighest);
    }
}
