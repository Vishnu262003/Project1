import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (1-9999): ");
        int year = scanner.nextInt();

        if (year < 1 || year > 9999) {
            System.out.println("Invalid year! Must be between 1 and 9999.");
        } else {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + " is " + (isLeap ? "a leap year." : "not a leap year."));
        }
        scanner.close();
    }
}
