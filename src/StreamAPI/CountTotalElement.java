package StreamAPI;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class CountTotalElement {
    public static void main(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        long count = numbers.stream()
                .count();
        System.out.println(count);
    }
}
