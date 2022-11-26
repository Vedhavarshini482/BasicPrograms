import java.util.Scanner;

abstract class Factorial {
	public void factorial() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find factorial of that number");
		int number = scanner.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++)
			fact = fact * i;
		System.out.println("factorial of " + number + " is " + fact);
		String s = Integer.toString(fact);
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';
		System.out.println("Sum of digits in the factorial number is " + sum);
	}
}

public class Program35 extends Factorial {

	public static void main(String[] args) {
		Program35 program = new Program35();
		program.factorial();
	}
}