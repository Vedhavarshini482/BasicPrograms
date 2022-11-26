import java.util.Scanner;

abstract class PatternPrinting2 {
	
	public void pattern2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int number = scanner.nextInt();
		for (int i = number; i >= 1; i--) {
			for (int j = 1; j < 2 * i - 1; j++)
				System.out.print(" ");
			for (int j = i; j <= number; j++)
				System.out.print(j + " ");
			for (int j = number; j > i; j--)
				System.out.print(j - 1 + " ");
			System.out.println();
		}
	}
}

public class Program48 extends PatternPrinting2 {

	public static void main(String[] args) {
		Program48 program = new Program48();
		program.pattern2();
	}
}