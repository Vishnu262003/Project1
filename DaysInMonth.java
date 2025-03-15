import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year (1-9999): ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Invalid input!");
        } else {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int days;

            switch (month) {
                case 2:
                    days = isLeap ? 29 : 28;
                    break;
                case 4, 6, 9, 11:
                    days = 30;
                    break;
                default:
                    days = 31;
            }

            System.out.println("Days in month: " + days);
        }
        scanner.close();
    }
}
