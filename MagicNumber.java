import java.util.Scanner;
public class MagicNumber {
    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static boolean isMagicNumber(int num) {
        while (num >= 10) {
            num = getSumOfDigits(num);
        }
        return num == 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num + " is " + (isMagicNumber(num) ? "a Magic Number." : "not a Magic Number."));
        scanner.close();
    }
}