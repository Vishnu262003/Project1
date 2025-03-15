import java.util.*;
public class HeightConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int feet = sc.nextInt();
		double inches = sc.nextDouble();
		double totalInches = (feet * 12) + inches;
		double cm= totalInches * 2.54;
		System.out.println(cm);
		sc.close();
	}
}
