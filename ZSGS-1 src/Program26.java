interface LongKeyword {
	abstract void longKeyword();
}

class WorkingOfLong implements LongKeyword {

	public void longKeyword() {
		System.out.println("Size for Long Datatype = " + Long.SIZE);
		System.out
				.println("Maximum value of Long Datatype = " + Long.MAX_VALUE);
		System.out
				.println("Minimum value of Long Datatype = " + Long.MIN_VALUE);
	}
}

public class Program26 {

	public static void main(String[] args) {
		WorkingOfLong keyword = new WorkingOfLong();
		keyword.longKeyword();
	}
}