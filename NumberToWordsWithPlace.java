import java.util.Scanner;
public class NumberToWordsWithPlace {
    static String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public static String convertToWords(int num) {
        if (num == 0) return "Zero";

        StringBuilder words = new StringBuilder();
        if (num / 1000 > 0) {
            words.append(ones[num / 1000]).append(" Thousand ");
            num %= 1000;
        }
        if (num / 100 > 0) {
            words.append(ones[num / 100]).append(" Hundred ");
            num %= 100;
        }
        if (num > 19) {
            words.append(tens[num / 10]).append(" ");
            num %= 10;
        } else if (num >= 10) {
            words.append(teens[num - 10]).append(" ");
            num = 0;
        }
        if (num > 0) {
            words.append(ones[num]).append(" ");
        }
        return words.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-1000): ");
        int num = scanner.nextInt();

        if (num < 1 || num > 1000) {
            System.out.println("Invalid input! Number must be between 1 and 1000.");
        } else {
            System.out.println("Number in words: " + convertToWords(num));
        }
        scanner.close();
    }
}