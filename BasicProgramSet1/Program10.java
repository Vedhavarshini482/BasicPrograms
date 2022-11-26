import java.util.Scanner;

class AlternateSorting {

	public void alternateSorting() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = scanner.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the first Array Elements");
		for (int i = 0; i < a; i++)
			arr[i] = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				int n = arr[arr.length - 1];
				for (int j = arr.length - 1; j > i; j--)
					arr[j] = arr[j - 1];
				arr[i] = n;
			}
		}
		for (int i = 0; i < a; i++)
			System.out.print(arr[i] + " ");
	}
}

public class Program10 {

	public static void main(String[] args) {
		AlternateSorting sort = new AlternateSorting();
		sort.alternateSorting();
	}
}