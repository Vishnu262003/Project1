import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Emp {
    int id;
    String name;
    int age;
    // Constructor to initialize employee details
    public Emp(int id, String name, int age) {
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
public class EmployeeName {
    public static void main(String[] args) {
        // Creating a list of 5 Employees (Direct Data)
        List<Emp> employees = new ArrayList<>();
        employees.add(new Emp(101, "John", 25));
        employees.add(new Emp(102, "Robert", 28));
        employees.add(new Emp(103, "Alicia", 23));
        employees.add(new Emp(104, "Mark", 30));
        employees.add(new Emp(105, "Jennifer", 29));
        // Using Streams to get the length of the name
        List<Integer> nameLengths = employees.stream()
                .map(emp -> emp.getNameLength())
                .collect(Collectors.toList());
        // Displaying Name Lengths
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee Name: " + employees.get(i).name + ", Length: " + nameLengths.get(i));
        }
    }
}