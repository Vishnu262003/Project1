import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
public class Main1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry", "carrot");
        // Grouping words by their last character
        Map<Character, List<String>> groupedByLastChar = words.stream()
            .collect(Collectors.groupingBy(
                word -> word.charAt(word.length() - 1), // Group by last character
                Collectors.toList() // Collect words in a list
            ));
        // Print the grouped result
        groupedByLastChar.forEach((key, value) -> 
            System.out.println("Group: " + key + " -> " + value));
    }
}