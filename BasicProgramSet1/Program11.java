import java.util.Scanner;

abstract class Array {
	abstract void multiDimentional();
}

class MultiDimentional extends Array {
	public void multiDimentional() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of row and column");
		int a = s.nextInt(), b = s.nextInt();
		int array[][] = new int[a][b];
		int arr[][] = new int[a][b];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++)
				array[i][j] = s.nextInt();
		}
		System.out
				.println("Enter how many times you want to rotate the Multi dimentional Array");
		int rotate = s.nextInt();
		for (int i = 0; i < rotate; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int k = 1, l = 0; k < array[0].length; k++, l++)
					arr[j][l] = array[j][k];
				arr[j][array.length - 1] = array[j][0];
			}
			array = arr;
			arr = new int[a][b];
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}

public class Program11 {

	public static void main(String[] args) {
		MultiDimentional m = new MultiDimentional();
		m.multiDimentional();
	}
}