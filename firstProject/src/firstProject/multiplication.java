package firstProject;

public class multiplication {
	void mult() {
		mult(5);
	}

	void mult(int n) {
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d * %d = %d", n, i, n * i).println();
		}
	}

}
