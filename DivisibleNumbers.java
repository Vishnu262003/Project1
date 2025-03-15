import java.util.Scanner;
public class DivisibleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first divisor: ");
        int div1 = scanner.nextInt();
        System.out.print("Enter second divisor: ");
        int div2 = scanner.nextInt();

        int count = 0, sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % div1 == 0 && i % div2 == 0) {
                System.out.println(i);
                sum += i;
                count++;
                if (count == 5) break;
            }
        }
        System.out.println("Sum of found numbers: " + sum);
        scanner.close();
    }
}