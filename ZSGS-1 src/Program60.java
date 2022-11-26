import java.util.Scanner;

interface SumOfSeries {
	void sumOfSeries();
}

public class Program60 {

	public static void main(String[] args) {
		Program60 program = new Program60();
		program.sumOfSeries();
	}

	public void sumOfSeries() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int terms = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= terms; i++) {
			sum = (sum * 10) + i;
		}
		System.out.println(sum);
	}
}