import java.util.*;
public class VowelConsonantCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		int vowelCount=0, consonantCount=0;
		String vowels="aeiouAEIOU";
		for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
		System.out.println("Total Vowels:" + vowelCount);
		System.out.println("Total Consonants: " + consonantCount);
	}

}
