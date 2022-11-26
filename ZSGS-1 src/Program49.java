import java.util.Scanner;

abstract class PatternPrinting3 {
	public void pattern3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many row to be printed");
		int number = scanner.nextInt();
		for (int i = number; i >= 1; i--) {
			for (int j = i; j < number; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}

public class Program49 extends PatternPrinting3 {

	public static void main(String[] args) {
		Program49 program = new Program49();
		program.pattern3();
	}
}