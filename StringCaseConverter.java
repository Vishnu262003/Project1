import java.util.*;
public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Accept two strings from user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        // Combine strings without spaces
        String combined = removeSpaces(str1) + removeSpaces(str2);
        // Convert to Upper Case, Lower Case, and Camel Case
        System.out.println("Upper Case: " + toUpperCase(combined));
        System.out.println("Lower Case: " + toLowerCase(combined));
        System.out.println("Camel Case: " + toCamelCase(combined));
        sc.close();
    }
    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String toCamelCase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalize = false;
        for (char ch : str.toCharArray()) {
            if (sb.length() == 0) {
                sb.append(ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch);
            } else if (capitalize) {
                sb.append(ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch);
                capitalize = false;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
