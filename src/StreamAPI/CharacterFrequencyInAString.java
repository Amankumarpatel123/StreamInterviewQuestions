package StreamAPI;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequencyInAString {
    static void main() {
        String name= "Programming";
        Map<Character,Long> charFreq = name.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println(charFreq);
    }
}
