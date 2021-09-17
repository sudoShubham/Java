package OOPS;

public class BiNumbersRunner {

	public static void main(String[] args) {
		BiNumbers number = new BiNumbers(2, 5);
		System.out.println(number.add());
		System.out.println(number.multiply());
		number.doubleNum();
		System.out.println(number.getNum1());
		System.out.println(number.getNum2());

	}

}
