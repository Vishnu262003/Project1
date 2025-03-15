import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// Employee Class
class Employee {
    int empId;
    String empName;
    double salary;
    double hike;
    // Constructor
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    // Method to calculate hike based on salary condition
    public void calculateHike() {
        if (salary < 5000) {
            hike = salary * 0.06;
        } else if (salary < 10000) {
            hike = salary * 0.05;
        } else {
            hike = 0;
        }
    }
    // Override toString method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + empId + 
               ", Name: " + empName + 
               ", Salary: " + salary + 
               ", Hike: " + (hike > 0 ? hike : "No Hike");
    }
}
// Main Class
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        // Taking input from the user
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i+1));
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter Employee Name: ");
            scanner.nextLine();  // Consume newline
            String name = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            // Create Employee Object and add to List
            Employee emp = new Employee(id, name, salary);
            employeeList.add(emp);
        }

        // Using Streams to calculate hike
        employeeList.stream()
            .peek(Employee::calculateHike)  // Calculate hike for each employee
            .collect(Collectors.toList())  // Collect the result
            .forEach(System.out::println);  // Print each employee details
    }
}