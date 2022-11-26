interface Evaluation {
	void evaluation();
}

class Evaluations implements Evaluation {

	public void evaluation() {
		int y = 10;
		int z = (++y * (y++ + 5));
		System.out.println("(++y * (y++ + 5)) = " + z);
	}
}

public class Program21 {

	public static void main(String[] args) {
		Evaluations evaluation = new Evaluations();
		evaluation.evaluation();
	}
}