package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatingelements {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(89,54,45,5,4,5,89,5,42,5,7);
        Optional<Integer> nonRepatingFirst = numbers.stream()
                .collect(Collectors.groupingBy(num->num, LinkedHashMap:: new, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                        .findFirst();

        System.out.println(nonRepatingFirst.get());
    }
}
