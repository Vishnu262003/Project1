import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
public class StreamProgram1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "elephant", "dog", "cat", "umbrella", "zebra");
        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        Map<String, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(word -> vowels.contains(word.charAt(0)) ? "Vowel" : "Consonant"));
        groupedWords.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}