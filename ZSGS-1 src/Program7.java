import java.util.Scanner;

class Pattern2 {
	public void pattern2() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String in Odd Length");
		String st = s.next();
		int n = st.length() - 1;
		if (n % 2 == 0) {
			for (int i = 0; i < st.length(); i++) {
				for (int j = 0; j < st.length(); j++) {
					if (i == j || j == n)
						System.out.print(st.charAt(i));
					else
						System.out.print(" ");
				}
				n--;
				System.out.println();
			}
		}
	}
}

public class Program7 extends Pattern2 {

	public static void main(String[] args) {
		Program7 program = new Program7();
		program.pattern2();
	}
}