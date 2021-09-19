package loops;

public class LoopFunction {
	private int num;

	LoopFunction(int num) {
		this.num = num;
	}

	public void printSquare() {
		int i = 1;
		while (i * i < num) {
			System.out.print(i * i + " ");
			i++;
		}

	}

	public void printCube() {
		int flag = 1;
		int cube = 1;
		while (cube < num) {

			System.out.print(cube + " ");

			flag++;
			cube = flag * flag * flag;
		}

	}
}
