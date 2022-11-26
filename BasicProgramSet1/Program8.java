class StaticKeyword {
	static int a = 8;

	public static void staticKeyword() {
		int b = 2;
		System.out.println("b = " + b);
		b++;
		a++;
	}
}

public class Program8 extends StaticKeyword {

	public static void main(String[] args) {
		System.out.println("a = " + a);
		staticKeyword();
		System.out.println("a = " + a);
		staticKeyword();
		System.out.println("a = " + a);
	}
}