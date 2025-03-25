import java.util.*;
import java.util.stream.Collectors;
class Employe {
    String name;
    String department;
    int experience;
    public Employe(String name, String department, int experience) {
        this.name = name;
        this.department = department;
        this.experience = experience;
    }
    public String getExperienceLevel() {
        return experience < 3 ? "Junior" : experience < 7 ? "Mid-Level" : "Senior";
    }
    @Override
    public String toString() {
        return name;
    }
}
public class StreamProgram8 {
    public static void main(String[] args) {
        List<Employe> employees = Arrays.asList(
            new Employe("John", "IT", 2), new Employe("Jane", "HR", 5),
            new Employe("Alice", "IT", 8), new Employe("Bob", "HR", 1),
            new Employe("Charlie", "Finance", 6), new Employe("David", "Finance", 10));
        Map<String, Map<String, List<Employe>>> groupedEmployees = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department,
                        Collectors.groupingBy(Employe::getExperienceLevel)));
        groupedEmployees.forEach((dept, expMap) -> {
            System.out.println(dept + " : " + expMap);
        });
    }
}