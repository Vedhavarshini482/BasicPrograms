interface Evaluation2 {
	void evaluation();
}

class Evaluations2 implements Evaluation2 {

	public void evaluation() {
		int x = 5;
		System.out.println(" ++x - x++ + --x = " + (++x - x++ + --x));
	}
}

public class Program23 {

	public static void main(String[] args) {
		Evaluations evaluation = new Evaluations();
		evaluation.evaluation();
	}
}