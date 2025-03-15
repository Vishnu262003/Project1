import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
public class Demo {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList(
                "Vishnu", "Rahul", "Anjali", "Vikram", "Ramesh", "Jayanth", "Jagadish",
                "Aryan", "Bhavya", "Akash", "Varun", "Rajesh");
        // Group names by the first letter in alphabetical order
        Map<Character, List<String>> groupedNames = names.stream()
                .sorted()
                .collect(Collectors.groupingBy(name -> name.charAt(0), TreeMap::new, Collectors.toList()));
        // Print the grouped names
        groupedNames.forEach((letter, nameList) -> {
            System.out.println(letter + ": " + nameList);
        });
    }
}