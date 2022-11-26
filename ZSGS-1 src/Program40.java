import java.util.Scanner;

abstract class ElementsCount {

	public void elementsCount() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println(a.length + " elements present in an array");
	}
}

public class Program40 extends ElementsCount {

	public static void main(String[] args) {
		Program40 program = new Program40();
		program.elementsCount();
	}
}