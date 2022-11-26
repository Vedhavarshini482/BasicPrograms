import java.util.Scanner;

abstract class PatternPrinting1 {
	public void pattern1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= 2 * (number - i); j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			for (int j = i; j > 1; j--)
				System.out.print(j - 1 + " ");
			System.out.println();
		}
	}
}

public class Program47 extends PatternPrinting1 {

	public static void main(String[] args) {
		Program47 program = new Program47();
		program.pattern1();
	}
}