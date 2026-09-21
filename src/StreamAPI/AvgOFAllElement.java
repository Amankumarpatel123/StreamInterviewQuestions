package StreamAPI;

import java.util.*;

public class AvgOFAllElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(2,3,5,5,4,33,37,45,3,6);
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue).average();
        System.out.println(average.getAsDouble());
    }
}
