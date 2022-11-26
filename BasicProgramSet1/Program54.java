import java.util.Scanner;

interface OddEven {
	abstract void oddAndEvenPositions();
}

public class Program54 implements OddEven {

	public static void main(String[] args) {
		Program54 program = new Program54();
		program.oddAndEvenPositions();
	}

	public void oddAndEvenPositions() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		int arr[] = array.clone();
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int odd[] = new int[size / 2];
		int even[] = new int[size / 2];
		if (size % 2 != 0) {
			odd = new int[(size / 2) + 1];
		}
		int i = 0, j = 0, k = 0;
		while (i < array.length) {
			if (i % 2 == 0) {
				odd[j] = array[i];
				j++;
			} else {
				even[k] = array[i];
				k++;
			}
			i++;
		}
		for (i = 0; i < odd.length; i++) {
			for (j = i + 1; j < odd.length; j++)
				if (odd[i] < odd[j]) {
					int temp = odd[i];
					odd[i] = odd[j];
					odd[j] = temp;
				}
		}
		for (i = 0; i < even.length; i++) {
			for (j = i + 1; j < even.length; j++)
				if (even[i] > even[j]) {
					int temp = even[i];
					even[i] = even[j];
					even[j] = temp;
				}
		}
		for (i = 0, j = 0, k = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = odd[j];
				j++;
			} else {
				arr[i] = even[k];
				k++;
			}
		}
		System.out
				.println("After sorting the elements in odd positions in descending order and elements in ascending order");
		for (k = 0; k < arr.length; k++)
			System.out.print(arr[k] + " ");
	}
}
