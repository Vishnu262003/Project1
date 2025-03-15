import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-1000): ");
        int num = scanner.nextInt();

        if (num < 1 || num > 1000) {
            System.out.println("Invalid input! Number must be between 1 and 1000.");
            return;
        }

        int factorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;
            }
        }

        boolean isPrime = (factorCount == 2);
        System.out.println("Number " + num + " has " + factorCount + " factors.");
        System.out.println(num + " is " + (isPrime ? "a Prime Number" : "not a Prime Number."));
        
        scanner.close();
    }
}