import java.util.Scanner;

class Table {
	public int table() {
		Scanner s = new Scanner(System.in);
		System.out
				.println("Enter which Multiplication and Subtraction table you want");
		int n = s.nextInt();
		return n;
	}
}

class Tables extends Table {
	public void mulTable(int a) {
		System.out.println("Multiplication Table for " + a);
		for (int i = 1; i <= 20; i++)
			System.out.println(a + " * " + i + " = " + (a * i));
	}

	public void subTable(int a) {
		System.out.println("Subtraction Table for " + a);
		for (int i = 1; i <= 20; i++)
			System.out.println(a + " - " + i + " = " + (a - i));
	}
}

public class Program1 {

	public static void main(String[] args) {
		Program1 program = new Program1();
		program.table();
	}

	public void table() {
		Tables t = new Tables();
		int a = t.table();
		t.mulTable(a);
		t.subTable(a);
	}
}