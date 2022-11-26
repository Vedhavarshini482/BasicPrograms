import java.util.Scanner;

abstract class CopyElements {
	
	public void copyElements() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		int duplicate[] = array;
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		for (int i = 0; i < array.length; i++)
			duplicate[i] = array[i];
		System.out
				.println("From the Array the elements are copied which is given below");
		for (int i = 0; i < array.length; i++)
			System.out.print(duplicate[i] + " ");
	}
}

public class Program41 extends CopyElements {

	public static void main(String[] args) {
		Program41 program = new Program41();
		program.copyElements();
	}
}