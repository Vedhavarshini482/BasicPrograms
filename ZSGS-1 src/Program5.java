import java.util.Scanner;

class Pattern {
	public void pattern9() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);
		for (char c = ch; c >= 'A'; c--) {
			for (int i = c - 64; i >= 1; i--)
				System.out.print(c);
			System.out.println();
		}
	}
}

public class Program5 extends Pattern {

	public static void main(String[] args) {
		Program5 program = new Program5();
		program.pattern9();
	}
}
