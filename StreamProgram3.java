import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
public class StreamProgram3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "elephant", "dog", "cat", "umbrella", "zebra");
        Map<Integer, List<String>> groupedByVowelCount = words.stream()
                .collect(Collectors.groupingBy(word -> countVowels(word)));
        groupedByVowelCount.forEach((key, value) -> System.out.println("Vowel Count " + key + " : " + value));
    }
    private static int countVowels(String word) {
        return (int) word.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .count();
    }
}
