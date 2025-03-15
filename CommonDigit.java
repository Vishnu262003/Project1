import java.util.Scanner;
public class CommonDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (10-99): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number (10-99): ");
        int num2 = scanner.nextInt();

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            System.out.println("Invalid input! Both numbers must be between 10 and 99.");
        } else {
            int d1 = num1 / 10, d2 = num1 % 10;
            int d3 = num2 / 10, d4 = num2 % 10;

            if (d1 == d3 || d1 == d4) System.out.println("Common digit: " + d1);
            if (d2 == d3 || d2 == d4) System.out.println("Common digit: " + d2);
            if (d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4) System.out.println("No common digits.");
        }
        scanner.close();
    }
}