import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if(isPalindrome(str)) {
			System.out.print("The String is a Palindrome.");
		}
		else {
			System.out.print("The String is not a Palindrome.");
		}
	}
	public static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();
		int left=0, right= str.length()-1;
		while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
	}
}
