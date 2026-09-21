package StreamAPI;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class ElementOccurenceOnlyOnce {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,1,2,2,3,4,4,5,5,6,6,7,7,8,8,9,9);
        List<Integer> once = numbers.stream()
                        .collect(Collectors.groupingBy(num-> num, Collectors.counting()))
                                .entrySet()
                                        .stream()
                                                .filter(e->e.getValue()==1)
                                                        .map(Map.Entry::getKey)
                                                                .collect(Collectors.toList());

        System.out.println(once);
    }
}