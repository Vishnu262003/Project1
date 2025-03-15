import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> ram = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumbers = ram.stream()
                                      .filter(num -> num % 2 != 0)
                                      .collect(Collectors.toList());
        OptionalDouble avg = oddNumbers.stream()
                                       .mapToInt(Integer::intValue)
                                       .average();
        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("Average: " + (avg.isPresent() ? avg.getAsDouble() : "N/A"));
    }
}