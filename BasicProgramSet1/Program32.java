import java.util.Scanner;

abstract class PositiveOrNegative {
	public void positiveOrNegative() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if (number > 0)
			System.out.println(number + " is a Positive number");
		else
			System.out.println(number + " is a Negative number");
	}
}

public class Program32 extends PositiveOrNegative {

	public static void main(String[] args) {
		Program32 program = new Program32();
		program.positiveOrNegative();
	}
}