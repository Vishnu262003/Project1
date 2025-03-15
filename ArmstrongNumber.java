import java.util.Scanner;
public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num + " is " + (isArmstrong(num) ? "an Armstrong number." : "not an Armstrong number."));
        scanner.close();
    }
}