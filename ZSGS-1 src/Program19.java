abstract class Expression {
	abstract void expression();
}

class Expressions extends Expression {
	public void expression() {
		int a = 28;
		System.out.println("a += a++ + ++a + --a + a-- is "
				+ (a += a++ + ++a + --a + a--));
	}
}

public class Program19 {

	public static void main(String[] args) {
		Expressions expression = new Expressions();
		expression.expression();
	}
}