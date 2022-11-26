import java.util.Scanner;

abstract class SmallestElement {

	public void smallestElement() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
			min = Math.min(min, a[i]);
		System.out.println("Smallest element in the array " + min);
	}
}

public class Program39 extends SmallestElement {

	public static void main(String[] args) {
		Program39 program = new Program39();
		program.smallestElement();
	}
}