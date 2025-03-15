import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sumOfNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Sum of first " + n + " natural numbers: " + sumOfNumbers(n));
        scanner.close();
    }
}