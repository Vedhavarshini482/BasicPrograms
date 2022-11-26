import java.util.Scanner;

abstract class SumOfElement {

	public void sumOfElement() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		System.out.println("Sum of elements in the array is " + sum);
	}
}

public class Program45 extends SumOfElement {

	public static void main(String[] args) {
		Program45 program = new Program45();
		program.sumOfElement();
	}
}