import java.util.*;
import java.util.Scanner;
public class Height {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inches= sc.nextDouble();
		double cm= convertInchesToCm(inches);
		System.out.println("Height in Cm's:" + cm);
		sc.close();
	}
	public static double convertInchesToCm(double inches) {
		return inches * 2.54;
	}
}
