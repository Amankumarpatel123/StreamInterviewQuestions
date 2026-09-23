package StreamAPI;
import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindDuplicateCharacter {
    static void main() {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<Character> seen = new HashSet<>();
        List<Character> duplicate = str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> !seen.add(ch))
                .collect(Collectors.toList());
        System.out.println(duplicate);
    }
}
