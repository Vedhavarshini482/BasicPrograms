import java.util.Scanner;

interface QuotientANDRemainder {
	abstract void quotientANDremainder();
}

class QuotientRemainder {
	public void quotientANDremainder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int x = scanner.nextInt(), y = scanner.nextInt();
		System.out.println("Quotient of " + x + " and " + y + " is " + (x / y));
		System.out
				.println("Remainder of " + x + " and " + y + " is " + (x % y));
	}
}

public class Program25 {

	public static void main(String[] args) {
		QuotientRemainder program = new QuotientRemainder();
		program.quotientANDremainder();
	}
}