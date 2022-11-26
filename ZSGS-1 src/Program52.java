import java.util.Scanner;

interface ReverseString {
	void reverse(String[] string);
}

public class Program52 implements ReverseString {

	public static void main(String[] args) {
		Program52 program = new Program52();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of string array");
		int size = scanner.nextInt();
		System.out.println("Enter a String");
		String arr[] = new String[size];
		for (int i = 0; i < size; i++)
			arr[i] = scanner.next();
		program.reverse(arr);
	}

	public void reverse(String[] string) {
		for (int i = string.length - 1; i >= 0; i--)
			System.out.print(string[i] + " ");
	}
}