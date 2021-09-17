package OOPS;

public class BiNumbers {
	private int num1, num2;
//	BigDecimal num = new BigDecimal("11.25");

	BiNumbers(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int add() {
		return num1 + num2;
	}

	int multiply() {
		return num1 * num2;
	}

	void doubleNum() {
		num1 *= 2;
		num2 *= 2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

}
