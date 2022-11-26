import java.util.Scanner;

abstract class Evaluate {
	abstract void evaluate();
}

class EvaluateEquation {

	public void evaluate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scanner.nextInt();
		System.out.println("x = x++ * 2 + 3 * --x is "
				+ (x = x++ * 2 + 3 * --x));
	}
}

public class Program20 {

	public static void main(String[] args) {
		EvaluateEquation evaluate = new EvaluateEquation();
		evaluate.evaluate();
	}
}