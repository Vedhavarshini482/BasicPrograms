import java.util.Scanner;

abstract class PatternPrinting4 {
	public void pattern4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many row to be printed");
		int number = scanner.nextInt();
		for (int i = number; i >= 1; i--) {
			for (int j = i; j < number; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}

public class Program50 extends PatternPrinting4 {

	public static void main(String[] args) {
		Program50 program = new Program50();
		program.pattern4();
	}
}