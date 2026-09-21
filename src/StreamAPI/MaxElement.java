package StreamAPI;

import java.util.*;

public class MaxElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(2,3,5,5,4,33,37,45,3,6);
        Optional<Integer> max =  numbers.stream()
                .max(Integer::compareTo);
        System.out.println(max.get());
    }
}
