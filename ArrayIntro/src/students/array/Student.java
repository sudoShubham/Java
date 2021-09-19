package students.array;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {
	String name;
	int marks[];

	Student(String name, int marks[]) {
		this.name = name;
		this.marks = marks;

	}

	int numberOfMarks() {
		return marks.length;
	}

	int sumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	int maxMarks() {
		Arrays.sort(marks);
		return (marks[marks.length - 1]);
	}

	int minMarks() {
		Arrays.sort(marks);
		return (marks[0]);
	}

	BigDecimal avgMarks() {
		return new BigDecimal(sumOfMarks()).divide(new BigDecimal(numberOfMarks()));
	}

}
