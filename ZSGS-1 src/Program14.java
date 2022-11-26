import java.util.Scanner;

abstract class Rectangle {
	abstract void rectangle();
}

class RectangleArea extends Rectangle {

	protected void rectangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		int length = scanner.nextInt(), breadth = scanner.nextInt();
		System.out.println("Area of the rectangle = " + (length * breadth));
	}
}

public class Program14 {

	public static void main(String[] args) {
		RectangleArea rectangle = new RectangleArea();
		rectangle.rectangle();
	}
}
