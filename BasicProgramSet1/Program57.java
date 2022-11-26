import java.util.Scanner;

interface StringPyramid {
	void stringPyramid();
}

public class Program57 implements StringPyramid {

	public static void main(String[] args) {
		Program57 program = new Program57();
		program.stringPyramid();
	}

	public void stringPyramid() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string number in odd length");
		String string = scanner.next();
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if (i == j || j == string.length() - 1 - i)
					System.out.print(string.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}