package StreamAPI;

import java.util.*;
public class SumOfAllInteger {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        long sum = numbers.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
