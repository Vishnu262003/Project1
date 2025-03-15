import java.util.*;
public class MinutesSecondsToTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        if (minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid input! Minutes and seconds must be between 0 and 59.");
        } else {
            int totalSeconds = (minutes * 60) + seconds;
            int hours = totalSeconds / 3600;
            minutes = (totalSeconds % 3600) / 60;
            seconds = totalSeconds % 60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
        scanner.close();
    }
}
