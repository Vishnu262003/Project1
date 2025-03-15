import java.util.*;
public class PalindromeRange {
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
