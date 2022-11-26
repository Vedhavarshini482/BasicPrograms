import java.util.Scanner;

abstract class ElementFrequency {

	public void frequency() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		int arr[] = array.clone();
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					arr[j] = -1;
				}
			}
			if (arr[i] != -1)
				arr[i] = count;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1)
				System.out.println(array[i] + " occurs " + arr[i] + " times ");
		}
	}
}

public class Program42 extends ElementFrequency {

	public static void main(String[] args) {
		Program42 program = new Program42();
		program.frequency();
	}
}