package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumbers {
    static void main() {
        List<Integer> numbers = Arrays.asList(2,3,5,5,4,33,37,45,3,6);
        long count = numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
        // long count = numbers.stream()
        // .filter(num -> num % 2 == 0)
        // .mapToInt(Integer::intValue).count();
        System.out.println(count);
    }
}
