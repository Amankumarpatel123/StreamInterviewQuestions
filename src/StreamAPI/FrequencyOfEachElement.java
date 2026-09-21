package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
public class FrequencyOfEachElement {
    public static void main() {
        List<Integer> numbers = Arrays.asList(2,5,7,89,54,45,5,4,5,89,54);
        Map<Integer,Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(num -> num ,Collectors.counting()));
        System.out.println(frequency);
    }
}
