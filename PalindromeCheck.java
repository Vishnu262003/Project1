import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Invalid input! Please enter a positive number.");
        } else {
            System.out.println(num + " is " + (isPalindrome(num) ? "a Palindrome." : "not a Palindrome."));
        }
        scanner.close();
    }
}