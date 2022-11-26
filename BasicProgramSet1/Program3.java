import java.util.Scanner;

class Difference {
	public int diff() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		return n;
	}
}

class ReverseDiff extends Difference {
	public void reverseDiff(int a) {
		String s1 = Integer.toString(a);
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--)
			s2 += s1.charAt(i);
		int b = Integer.parseInt(s2);
		System.out.println(a + " - " + b + " = " + (a - b));
	}
}

public class Program3 {

	public static void main(String[] args) {
		Program3 program = new Program3();
		program.diff();
	}

	public void diff() {
		Difference d = new ReverseDiff();
		int a = d.diff();
		ReverseDiff r = new ReverseDiff();
		r.reverseDiff(a);
	}
}