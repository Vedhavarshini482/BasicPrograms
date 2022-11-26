import java.util.Scanner;

abstract class LeftRotate {
	public void leftRotate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		int arr[] = array.clone();
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out
				.println("Enter how many times rotate the array in left side");
		int rotate = scanner.nextInt();
		for (int i = 0; i < rotate; i++) {
			arr[array.length - 1] = array[0];
			for (int j = 1, k = 0; j < arr.length; j++, k++)
				arr[k] = array[j];
			array = arr.clone();
		}
		System.out.println("After " + rotate + " rotation ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}

public class Program43 extends LeftRotate {

	public static void main(String[] args) {
		Program43 program = new Program43();
		program.leftRotate();
	}
}