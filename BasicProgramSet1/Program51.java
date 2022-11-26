import java.util.Scanner;

interface ReverseWithoutString {
	abstract void reverseWithoutString();
}

public class Program51 implements ReverseWithoutString {

	public static void main(String[] args) {
		Program51 program = new Program51();
		program.reverseWithoutString();
	}

	public void reverseWithoutString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int temp = 0, index = 0;
		while (number != 0) {
			temp = number % 10;
			index = (index * 10) + temp;
			number = number / 10;
		}
		System.out.println("The Number in reverse Order " + index);
	}
}