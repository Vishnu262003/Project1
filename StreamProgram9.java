import java.util.*;
import java.util.stream.Collectors;
public class StreamProgram9 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "A"), new Student("Bob", "B"),
            new Student("Charlie", "A"), new Student("David", "C"),
            new Student("Eve", "B"), new Student("Frank", "A"));
        Map<String, Long> studentCountByGrade = students.stream()
                .collect(Collectors.groupingBy(s -> s.grade, Collectors.counting()));
        studentCountByGrade.forEach((grade, count) -> System.out.println(grade + " : " + count));
    }
}