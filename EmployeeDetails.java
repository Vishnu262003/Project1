import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Empl{
    int id;
    String name;
    int age;
    // Constructor to Initialize Employee Details
    public Empl(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // Method to get the length of the name
    public int getNameLength() {
        return this.name.length();
    }
}
//Main Class
public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating a list of 5 Employees (Direct Data)
        List<Empl> employees = new ArrayList<>();
        employees.add(new Empl(101, "John", 25));
        employees.add(new Empl(102, "Robert", 28));
        employees.add(new Empl(103, "Alicia", 23));
        employees.add(new Empl(104, "Mark", 30));
        employees.add(new Empl(105, "Jennifer", 29));
        // Using Streams to filter names with length > 4 and sort them by name length
        List<Integer> filteredNames = employees.stream()
                .filter(emp -> emp.getNameLength() > 4)
                .map(emp -> emp.getNameLength())
                .sorted()
                .collect(Collectors.toList());
        // Printing the sorted Employee Names
        filteredNames.forEach(System.out::println);
    }
}