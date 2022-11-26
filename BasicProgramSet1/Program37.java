import java.util.Scanner;

abstract class OddPosition {

	public void oddPosition() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println("The Elements of an array in Odd Position");
		for (int i = 0; i < a.length; i += 2)
			System.out.print(a[i] + " ");
	}
}

public class Program37 extends OddPosition {

	public static void main(String[] args) {
		Program37 program = new Program37();
		program.oddPosition();
	}
}