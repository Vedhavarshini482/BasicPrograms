import java.util.Scanner;

abstract class SumOfNaturalNumbers {
	public void naturalNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter a Positive number to stop the sum of Natural numbers ");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++)
			sum += i;
		System.out.println("Sum of natural numbers = " + sum);
		String s = Integer.toString(sum);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			max = Math.max(max, s.charAt(i) - '0');
		}
		System.out.println("Largest digit of the sum " + max);
	}
}

public class Program34 extends SumOfNaturalNumbers {

	public static void main(String[] args) {
		Program34 program = new Program34();
		program.naturalNumber();
	}
}