import java.util.Scanner;

abstract class AlphabetOrNot {
	public void alphabet() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scanner.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(ch + " is an Alphabet");
		else
			System.out.println(ch + " is not an Alphabet");
	}
}

public class Program33 extends AlphabetOrNot {

	public static void main(String[] args) {
		Program33 program = new Program33();
		program.alphabet();
	}
}