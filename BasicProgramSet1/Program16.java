import java.util.Scanner;

abstract class Polynomial {
	abstract void polynomialEquation();
}

class PolynomialEquation extends Polynomial {

	public void polynomialEquation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c values");
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		System.out.println("Root1 = " + (-b + Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
		System.out.println("Root2 = " + (-b - Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
	}
}

public class Program16 {

	public static void main(String[] args) {
		PolynomialEquation polynomial = new PolynomialEquation();
		polynomial.polynomialEquation();
	}
}