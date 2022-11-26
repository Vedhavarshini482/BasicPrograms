import java.util.Scanner;

interface EvenOrOdd {
	abstract void evenOrOdd();
}

class OddOrEven implements EvenOrOdd {
	public void evenOrOdd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if (number % 2 == 0)
			System.out.println(number + " is an Even Number");
		else
			System.out.println(number + " is an Odd Number");
	}
}

public class Program28 {

	public static void main(String[] args) {
		OddOrEven number = new OddOrEven();
		number.evenOrOdd();
	}
}