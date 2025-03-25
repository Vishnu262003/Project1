import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
public class StreamProgram5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Map<String, List<Integer>> groupedByPrime = numbers.stream()
                .collect(Collectors.groupingBy(num -> isPrime(num) ? "Prime" : "Not Prime"));        
        groupedByPrime.forEach((key, value) -> System.out.println(key + " : " + value));
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}