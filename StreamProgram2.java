import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
public class StreamProgram2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80);
        Map<String, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(num -> {
                    if (num % 2 == 0 && num % 5 == 0) return "Divisible by 2 and 5";
                    else if (num % 2 == 0) return "Divisible by 2";
                    else if (num % 5 == 0) return "Divisible by 5";
                    else return "Neither";
                }));
        groupedNumbers.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
