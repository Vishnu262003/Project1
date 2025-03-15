import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Test1 {

    public static void main(String[] args) {
        // Create a list of numbers (using Arrays.asList for Java 8)
        List numbers = List.of(-5, 3, 0, -1, 4, 0, -8, 9, -2, 5);
        // Group numbers based on their nature (Positive, Negative, Zero)
        Map<String, List> groupedNumbers = (Map<String, List>) numbers.stream()
                .collect(Collectors.groupingBy(num -> {
                    if (num > 0) return "Positive Numbers";
                    else if (num < 0) return "Negative Numbers";
                    else return "Zero";
                }));
        // Print the grouped results
        groupedNumbers.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}