import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter previous meter reading: ");
        int previousReading = sc.nextInt();
        
        System.out.print("Enter current meter reading: ");
        int currentReading = sc.nextInt();
        // Calculate and display bill amount
        int totalBill = calculateBill(previousReading, currentReading);
        System.out.println("Total Bill Amount: Rs. " + totalBill);
        sc.close();
    }
    public static int calculateBill(int previousReading, int currentReading) {
        8 unitsConsumed = currentReading - previousReading;
        if (unitsConsumed < 100) {
            return unitsConsumed * 2;
        } else {
            int remainingUnits = unitsConsumed - 100;
            return (remainingUnits * 5) + 200;
        }
    }
}