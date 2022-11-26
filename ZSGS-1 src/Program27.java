import java.util.Scanner;

interface Swapping {
	abstract void swapNumbers();
}

class SwapNumbers implements Swapping {
	public void swapNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt(), b = s.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a = " + a + "\nb = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class Program27 {

	public static void main(String[] args) {
		SwapNumbers swap = new SwapNumbers();
		swap.swapNumbers();
	}
}