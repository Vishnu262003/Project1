import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Find and display duplicate characters
        findDuplicateCharacters(input);
        
        scanner.close();
    }
    
    public static void findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) { // Consider only letters and digits
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        boolean hasDuplicates = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                hasDuplicates = true;
            }
        }
        
        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }
}
