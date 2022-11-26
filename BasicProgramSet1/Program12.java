abstract class WithoutString {
	abstract void withoutString();
}

class PrintNumber extends WithoutString {
	public void withoutString() {
		float number = 7.50f;
		System.out.printf("%.2f", number);
	}
}

public class Program12 {

	public static void main(String[] args) {
		PrintNumber printNumber = new PrintNumber();
		printNumber.withoutString();
	}
}