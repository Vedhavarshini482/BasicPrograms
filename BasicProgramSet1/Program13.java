import java.util.Scanner;

abstract class FindArea {
	abstract void area();
}

class Area extends FindArea {
	public void area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		int side = scanner.nextInt();
		System.out.println("Area of the square = " + (side * side));
	}
}

public class Program13 {

	public static void main(String[] args) {
		Area area = new Area();
		area.area();
	}
}