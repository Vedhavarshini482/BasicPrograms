import java.util.Scanner;

class Character {
	public char character() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = s.next().charAt(0);
		return ch;
	}
}

class PrintCharacter extends Character {
	public void printCharacter(char ch) {
		for (char character = ch; character <= 'Z'; character++)
			System.out.print(character);
	}
}

public class Program2 {

	public static void main(String[] args) {
		Program2 program = new Program2();
		program.character();
	}

	public void character() {
		PrintCharacter c = new PrintCharacter();
		char ch = c.character();
		c.printCharacter(ch);
	}
}