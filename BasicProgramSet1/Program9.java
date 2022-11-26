import java.util.Scanner;

class MergeArray {
	
	public void merfeArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the 1st and 2nd Array");
		int a = scanner.nextInt(), b = scanner.nextInt();
		int arr1[] = new int[a];
		int arr2[] = new int[b];
		System.out.println("Enter the first sorted Array :");
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = scanner.nextInt();
		System.out.println("Enter the second sorted Array :");
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = scanner.nextInt();
		int array[] = new int[arr1.length + arr2.length];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i < arr1.length)
				array[i] = arr1[i];
			else {
				array[i] = arr2[j];
				j++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
		}
		int j = 0, count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1])
				array[j++] = array[i];
			else
				count++;
		}
		array[j++] = array[array.length - 1];
		System.out.println("Merged array without duplicates :");
		for (int i = 0; i < array.length - count; i++)
			System.out.print(array[i] + " ");
	}
}

public class Program9 {

	public static void main(String[] args) {
		MergeArray merge = new MergeArray();
		merge.merfeArray();
	}
}