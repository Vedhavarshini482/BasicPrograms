import java.util.Scanner;

abstract class RightRotation {
	public void rightRotation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		int arr[] = array.clone();
		System.out.println("Enter the elements of an Array");
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		System.out.println("Enter how many rotate the array in right side");
		int rotate = scanner.nextInt();
		for (int i = 0; i < rotate; i++) {
			arr[0] = array[array.length - 1];
			for (int j = 0, k = 1; j < array.length - 1; j++, k++)
				arr[k] = array[j];
			array = arr.clone();
		}
		System.out.println("After " + rotate + " right side rotation");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}

public class Program46 extends RightRotation {

	public static void main(String[] args) {
		Program46 program = new Program46();
		program.rightRotation();
	}
}