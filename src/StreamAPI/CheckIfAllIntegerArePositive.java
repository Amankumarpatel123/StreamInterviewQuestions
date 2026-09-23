package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllIntegerArePositive {
    static void main() {
        List<Integer> numbers= Arrays.asList(1,2,3,-4,-5,-6);
        boolean ifPositive = numbers.stream()
                .allMatch(num-> num> 0);
        System.out.println(ifPositive);
    }
}
