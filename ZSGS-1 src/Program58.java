import java.util.Scanner;

interface StarUnderscorePattern {
	void starUnderscorePattern();
}

public class Program58 implements StarUnderscorePattern {

	public static void main(String[] args) {
		Program58 program = new Program58();
		program.starUnderscorePattern();
	}

	public void starUnderscorePattern() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			for (int j = 1; j <= 2 * number; j++) {
				if (j > number - i && j <= number + i)
					System.out.print("_");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = number - 2; i >= 0; i--) {
			for (int j = 1; j <= 2 * number; j++) {
				if (j > number - i && j <= number + i)
					System.out.print("_");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}