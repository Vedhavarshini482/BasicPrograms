import java.util.Scanner;

abstract class PolynomialEqn {

	public void polynomialEqn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c values");
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		System.out.println("Root1 = " + (-b + Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
		System.out.println("Root2 = " + (-b - Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
	}
}

public class Program31 extends PolynomialEqn {

	public static void main(String[] args) {
		Program31 program = new Program31();
		program.polynomialEqn();
	}
}