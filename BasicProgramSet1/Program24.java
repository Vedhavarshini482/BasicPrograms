import java.util.Scanner;

interface AsciiValue {
	void asciiValue();
}

class Ascii implements AsciiValue {

	public void asciiValue() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);
		System.out.println("ASCII value of \'" + ch + "\' is " + (int) ch);
	}
}

public class Program24 {

	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		ascii.asciiValue();
	}
}