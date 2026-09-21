package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
public class SquareOfEveryNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10);
        List<Integer> square = numbers.stream()
                .map(num -> num * num )
                .collect(Collectors.toList());
        System.out.println(square);
    }


}
