class Groups {
	public void group() {
		int group = 4;
		int group1[] = new int[20 / 4];// 20 Students
		int group2[] = new int[20 / 4];
		int group3[] = new int[20 / 4];
		int group4[] = new int[20 / 4];
		for (int i = 1; i <= group; i++) {
			for (int j = 100 + i, k = 0; j <= 120; j += 4, k++) {
				if (i == 1)
					group1[k] = j;
				else if (i == 2)
					group2[k] = j;
				else if (i == 3)
					group3[k] = j;
				else
					group4[k] = j;
			}
		}
		for (int i = 1; i <= group; i++) {
			System.out.println("Group " + i);
			for (int j = 0; j < group1.length; j++) {
				if (i == 1)
					System.out.println(group1[j] + " ");
				else if (i == 2)
					System.out.println(group2[j] + " ");
				else if (i == 3)
					System.out.println(group3[j] + " ");
				else
					System.out.println(group4[j] + " ");
			}
		}
	}
}

public class Program6 extends Groups {

	public static void main(String[] args) {
		Program6 program = new Program6();
		program.group();
	}
}