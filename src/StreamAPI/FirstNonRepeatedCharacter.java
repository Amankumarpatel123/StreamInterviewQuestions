package StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    static void main() {
        String str = "hhelloo";
        Character nonRepeated = str.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(e-> e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
        System.out.println("first non repeated character:  " + nonRepeated);
    }
}
