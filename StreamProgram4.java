import java.util.*;
import java.util.stream.Collectors;
public class StreamProgram4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 25, 33, 45, 52, 67, 78, 85, 92, 100);
        Map<String, List<Integer>> groupedByRange = numbers.stream()
                .collect(Collectors.groupingBy(num -> {
                    if (num <= 20) return "0-20";
                    else if (num <= 40) return "21-40";
                    else if (num <= 60) return "41-60";
                    else if (num <= 80) return "61-80";
                    else return "81-100";
                }));
        groupedByRange.forEach((range, numList) -> System.out.println(range + " : " + numList));
    }
}