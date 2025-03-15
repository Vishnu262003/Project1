import java.util.*;
public class NumberToWords {
    static String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String numStr = Integer.toString(num);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[Character.getNumericValue(digit)] + " ");
        }
        scanner.close();
    }
}
