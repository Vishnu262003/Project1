import java.util.*;
class BClass{
	String message;
	public BClass() {
		super();
		System.out.println("In BClass");
	}
	public BClass() {
		this.message=message;
		System.out.println("Message:" + message);
	}
}
class DClass extends BClass{
	public DClass() {
		System.out.println("In DClass");
	}
}
public class InheritenceInJava {

	public static void main(String[] args) {
		BClass bc = new BClass();
		DClass dc = new DClass();
	}

}
