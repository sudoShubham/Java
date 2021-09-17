package myPackage;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = scanner.nextInt();
		System.out.println("Enter number 2");
		int num2 = scanner.nextInt();

		MenuOperations operation = new MenuOperations(num1, num2);

		System.out.println("Enter your choice.\n1.Add\n2.Subtract.\n3.Multiply.\n4.Divide.");
		int choice = scanner.nextInt();
		if (choice == 1)
			System.out.println(operation.add());
		else if (choice == 2)
			System.out.println(operation.sub());
		else if (choice == 3)
			System.out.println(operation.mul());
		else if (choice == 4)
			System.out.println(operation.div());
		else
			System.out.println("Please enter correct choice.");
	}

}
