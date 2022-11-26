import java.util.Scanner;

interface AlphabetCPattern {
	abstract void alphabetPatternC();
}

public class Program55 implements AlphabetCPattern {

	public static void main(String[] args) {
		Program55 program = new Program55();
		program.alphabetPatternC();
	}

	public void alphabetPatternC() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be printed");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			if (i == 1 || i == row) {
				for (int j = 1; j <= row; j++)
					System.out.print("*");
			} else
				System.out.print("*");
			System.out.println();
		}
	}
}