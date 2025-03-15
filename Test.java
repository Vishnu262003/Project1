import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int target=sc.nextInt();
		int sum= a + b;
		if(sum == target) {
			System.out.println("True.");
		}
		else {
			System.out.println("False.");
		}
	}
}
