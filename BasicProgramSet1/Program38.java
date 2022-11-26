import java.util.Scanner;

abstract class LargestElement {

	public void largestElement() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
			max = Math.max(max, a[i]);
		System.out.println("Largest element in the array " + max);
	}
}

public class Program38 extends LargestElement {

	public static void main(String[] args) {
		Program38 program = new Program38();
		program.largestElement();
	}
}