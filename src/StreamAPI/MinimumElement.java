package StreamAPI;

import java.util.*;

public class MinimumElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(2,3,5,5,4,33,37,45,3,6);
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println(min.get());
    }
}
