import java.util.*;
import java.util.stream.Collectors;
class Student {
    String name;
    String grade;
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class StreamProgram7 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "A"), new Student("Bob", "B"),
            new Student("Charlie", "A"), new Student("David", "C"),
            new Student("Eve", "B"));
        Map<String, List<Student>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(s -> s.grade));
        groupedStudents.forEach((grade, studentList) -> System.out.println(grade + " : " + studentList));
    }
}