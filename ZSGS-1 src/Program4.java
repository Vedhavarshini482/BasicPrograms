import java.util.Scanner;

class Operators {
	public void operators() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt(), b = s.nextInt();
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
		System.out.println(a + " ~ " + b + " = " + (a >> b));
		System.out.println(a + " << " + b + " = " + (a << b));
		System.out.println(" ~ " + a + " = " + (~a));
		System.out.println(" ~ " + b + " = " + (~b));
	}
}

public class Program4 extends Operators {

	public static void main(String[] args) {
		Program4 program = new Program4();
		program.operators();
	}
}