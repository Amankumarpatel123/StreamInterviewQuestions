package StreamAPI;
import javax.swing.text.html.Option;
import java.util.*;

public class FindFirstElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(5,4,4,7,4,5,3);
        Optional<Integer> first = numbers.stream()
                .findFirst();

        System.out.println(first);

        }
    }

